//package copyFile;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.ObjectInputStream;
//import java.util.InputMismatchException;
//import java.util.List;
//
//public class copyAndPaste {
//    public List<Object> copy(String path){
//        try{
//            File file = new File(path);
//            if(!file.exists()){
//                throw new InputMismatchException();
//                file.createNewFile();
//            }
//            FileInputStream fis = new FileInputStream(path);
//            ObjectInputStream ois = new ObjectInputStream(fis);
//
//
//        }catch(Exception e){
//
//        }
//    }
//}
