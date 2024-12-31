package Collectionpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListProg {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Mango");
        list.add("banana");
        list.add("Chiku");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
