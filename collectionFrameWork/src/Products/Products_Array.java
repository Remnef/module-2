package Products;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Products_Array {
    private ArrayList<Product> list = new ArrayList<>();
    private Object SortByCost;

    public void add(String name,double cost){
        Product product = new Product(name,cost);
        list.add(product);
    }

    public void setProductById(int id, String name, int cost){
        if (id<0 ||id>=list.size()){
            throw new IndexOutOfBoundsException("Not found id");
        }else{
            list.get(id).setName(name);
            list.get(id).setCost(cost);
        }
    }

    public void deleteById(int id){
        if (id<0 ||id>=list.size()){
            throw new IndexOutOfBoundsException("Not found id");
        }else{
            list.remove(id);
        }
    }

    public int searchName(String name){
        boolean check = false;
        for(int i=0; i<list.size(); i++){
            if (list.get(i).getName() == name){
                check =true;
                return i;
            }
        }
        return -1;
    }

    public void sort(){
        SortByCost sortByCost = new SortByCost();
        Collections.sort(list,sortByCost);
    }

    public void printArr(){
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i).toString());
        }
    }



}
