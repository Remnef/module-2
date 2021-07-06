package TH_myList;

public class Test {
    public static void main(String[] args) {
        myList<Integer> list = new myList<Integer>();
        list.add(435);
        list.add(32);
        System.out.println(list);
        for (int i=0; i<list.getSize();i++)
            System.out.println(list.get(i));
    }
}
