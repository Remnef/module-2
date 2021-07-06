public class Person{
    private String name, address;
    private int age;

    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getAdress(){
        return address;
    }

    public int getAge(){
        return age;
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
    }
}
