package Products;

import Products.Product;
import Products.SortByCost;

import java.util.Collections;
import java.util.LinkedList;

public class Product_LinkIn {
    LinkedList<Product> list = new LinkedList<>();
    public Product_LinkIn(){

    }

    public void add(String name, double cost){
        Product product = new Product(name, cost);
        list.add(product);
    }

    public void setProductById(int id,String name,double cost){
        if(id<0 || id>=list.size()){
            throw new IndexOutOfBoundsException("Not found index");
        }else {
            list.get(id).setName(name);
            list.get(id).setCost(cost);
        }
    }

    public void deleteById(int id){
        if(id<0 || id>=list.size()){
            throw new IndexOutOfBoundsException("Not found index");
        }else {
            list.remove(id);
        }
    }

    public void print(){
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i).toString());
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


}
