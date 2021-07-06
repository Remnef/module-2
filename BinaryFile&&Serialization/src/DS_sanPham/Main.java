package DS_sanPham;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Mes","SD4","Mes",1234234124));
        list.add(new Product("Mes","SD4","Mes",1234234124));
        list.add(new Product("Mes","SD4","Mes",1234234124));
        list.add(new Product("Mes","SD4","Mes",1234234124));
        list.add(new Product("Mes","SD4","Mes",1234234124));
        list.add(new Product("Mes","SD4","Mes",1234234124));
        readAndWrite Workin = new readAndWrite();
        Workin.writeFile("E:\\module 2\\BinaryFile&&Serialization\\src\\DS_sanPham\\productList.txt",list);
        List<Product> products = Workin.readFile("E:\\module 2\\BinaryFile&&Serialization\\src\\DS_sanPham\\productList.txt");
        for(Product product : products){
            System.out.println(product.toString());
        }
    }
}
