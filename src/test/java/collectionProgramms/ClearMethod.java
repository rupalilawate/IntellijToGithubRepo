package collectionProgramms;

import java.util.LinkedList;

public class ClearMethod {

    public static void rmoveAllelements(LinkedList<Integer> l1){
        l1.clear();
        System.out.println("After clear the list:  "+ l1);
    }

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        System.out.println("Befor clear list: "+l1);
        rmoveAllelements(l1);

    }
}
