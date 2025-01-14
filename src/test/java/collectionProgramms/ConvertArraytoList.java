package collectionProgramms;

import java.util.*;

public class ConvertArraytoList {


    public static void main(String[] args) {

        Integer a[] = {1,2,3,4,5,6};
        List<Integer> lis = new ArrayList<>(Arrays.asList(a));
        System.out.println(lis);


    }
}
