package DS_sinhVien;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void writeToFile(String path, List<Student> students){

        try{
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oss = new ObjectOutputStream(fos);
            oss.writeObject(students);
            oss.close();
            fos.close();
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }

    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeToFile("E:\\module 2\\BinaryFile&&Serialization\\src\\DS_sinhVien\\student.txt",students);
        List<Student> studentDataFromFile = readDataFromFile("E:\\module 2\\BinaryFile&&Serialization\\src\\DS_sinhVien\\student.txt");
        for (Student student: studentDataFromFile){
            System.out.println(student.toString());
        }
    }
}

