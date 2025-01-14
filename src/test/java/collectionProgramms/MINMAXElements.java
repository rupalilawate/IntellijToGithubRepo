package collectionProgramms;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MINMAXElements {


    public static void minMaxNumbers(List<Integer> l1){
        int MIN = Collections.min(l1);
        System.out.println("Miminum number is: "+ MIN);
        int MAX = Collections.max(l1);
        System.out.println("Maximum number is: "+ MAX);
    }


    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        minMaxNumbers(l1);
    }

}
