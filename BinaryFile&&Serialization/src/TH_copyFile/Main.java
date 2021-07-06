//package TH_copyFile;
//
//import java.io.*;
//import java.nio.file.StandardCopyOption;
//import java.util.Scanner;
//
//public class Main {
//    private void copyFileUsingJava7Files(File source, File dest) throws IOException{
//
//        File.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
//    }
//
//    private void copyFileUsingStream(File source, File dest) throws IOException {
//        InputStream is = null;
//        OutputStream os = null;
//        try{
//            is = new FileInputStream(source);
//            os = new FileOutputStream(dest);
//            byte[] buffer = new byte[1024];
//            int length;
//            while((length = is.read(buffer)) > 0){
//                os.write(buffer, 0, length);
//            }
//
//        }
//        catch(Exception e){
//            System.err.println(e.getMessage());
//        }
//        finally {
//            is.close();
//            os.close();
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        System.out.printf("Enter source file:");
//        String sourcePath = in.nextLine();
//        System.out.printf("Enter destination file:");
//        String destPath = in.nextLine();
//
//        File sourceFile = new File(sourcePath);
//        File destFile = new File(destPath);
//
//        try {
//            copyFileUsingJava7Files(sourceFile, destFile);
//            //copyFileUsingStream(sourceFile, destFile);
//            System.out.printf("Copy completed");
//        } catch (IOException ioe) {
//            System.out.printf("Can't copy that file");
//            System.out.printf(ioe.getMessage());
//        }
//    }
//}
