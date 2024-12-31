package JavaProgramms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicArray {

    public static void main(String[] args) {

        int a[] = {1,2,1,2,3,4,5,6};
        Set<Integer> set = new HashSet<Integer>();
        List<Integer> list = new ArrayList<Integer>();

        for(Integer num:a){
            if(set.add(num)){
               set.add(num);
            }
            else{
                list.add(num);
            }
        }
        System.out.println(set);
        System.out.println("Duplicate elements: " + list);

    }
}
