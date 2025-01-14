package collectionProgramms;

import java.util.LinkedList;
import java.util.List;

public class RemoveElemeFromlist
{
    public static void removeElements(List<Integer> l1){
        l1.remove(1);
        System.out.println("element removed: "+ l1);
        l1.remove(1);
        System.out.println("element removed: "+ l1);

    }



    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(1);
        l1.add(2);
        System.out.println(l1);
        removeElements(l1);
    }
}
