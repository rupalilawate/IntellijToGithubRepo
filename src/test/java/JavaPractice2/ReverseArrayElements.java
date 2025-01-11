package JavaPractice2;

import java.util.*;

public class ReverseArrayElements {


    public static void main(String[] args) {
        int a[] = {6,8,9,4,3,2,8,9};
        Set<Integer> set = new HashSet<Integer>();

        for(Integer a1:a){
            if(set.add(a1)==false){
                System.out.print(a1+"  ");
            }

        }


    }

}
