package DS_sanPham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class readAndWrite {
    public void writeFile(String pathFile, List<Product> list){
        try{
            File file =new File(pathFile);
            if (!file.exists()){
                file.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(pathFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }

    public List<Product> readFile(String pathFile){
        List<Product> products = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(pathFile);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            ois.close();
            fis.close();
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
        return products;
    }
}
