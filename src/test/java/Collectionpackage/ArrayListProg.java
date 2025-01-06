package Collectionpackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProg {

    public static void main(String[] args) {

        ArrayList<Object> l1 = new ArrayList<Object>();
        l1.add(true);
        l1.add(null);
        l1.add(37.987);
        l1.add(null);
        l1.add("Sagar");
        l1.add(5);
        int size = l1.size();
        System.out.println("Total size of List: "+size);
        Iterator itr = l1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Accessing elements of list:  "+l1.get(2));
        System.out.println("remove one null:  "+ l1.remove(3));
        System.out.println("updated list:   "+l1.set(4,"Rupali"));
        System.out.println(l1);

    }



}
