package collectionProgramms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDuplicatElementFromArray {

    public static void main(String[] args) {

        int a[] = {1,1,1,2,2,3,4,5,6,6};
        HashSet<Integer> set = new HashSet<Integer>();
        List<Integer> l1 = new ArrayList<>();
        for(Integer a1:a){
            if(set.add(a1)==false){
                l1.add(a1);
            }

        }
        System.out.println(l1);


    }




}
