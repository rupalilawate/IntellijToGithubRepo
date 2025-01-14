package collectionProgramms;

import java.util.LinkedList;

public class LinkedListElements {


    public static void elementsOfList(LinkedList<String> l1){
        for(int i=0; i<l1.size();i++){
            System.out.println("Element at index:  "+i+" "+l1.get(i));
        }
        System.out.println(l1);

    }

    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("Java");
        l1.add("C#");
        l1.add("Python");
        l1.add("ruby");
        l1.add("Typescript");
        elementsOfList(l1);
    }



}
