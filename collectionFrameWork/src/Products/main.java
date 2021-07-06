package Products;

import java.util.Collections;
import java.util.Comparator;

public class main {
//    private static Object SortByCost;

    public static void main(String[] args) {
        //Arraylist

        Products_Array list = new Products_Array();
        list.add("car",12312312);
        list.add("car2",25342);
        list.add("car2",25342);
        list.add("car2",25342);
        list.add("car2",25342);
        list.add("car2",25342);
        list.add("car2",25342);
        list.sort();
        list.printArr();
        list.setProductById(0,"remnef",3245);
        list.printArr();

        //LinkIn

        Product_LinkIn lists = new Product_LinkIn();
        lists.add("car",12312312);
        lists.add("car2",25342);
        lists.add("car2",25342);
        lists.add("car2",25342);
        lists.add("car2",25342);
        lists.add("car2",25342);
        lists.add("car2",25342);
        lists.setProductById(0,"remnef",3245);
        lists.sort();
        lists.print();

    }
}
