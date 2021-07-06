package TH_method;

public class Student {
    private  int rollno;
    private  String name;
    private static  String college = "BBDIT";

    //constuctor to initialize the variable
    Student(int r, String n){
        rollno = r;
        name = n;
    }

    //static method to change the value of static variable

    static  void chage(){
        college = "CODEGYM";
    }

    //method to display values
    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
}
