package JavaPractice2;

import java.util.ArrayList;
import java.util.List;

public class FindNumberStartWith1 {

    public static void main(String[] args) {


        int a[]={200,201,100,1002,1001,2005,1014,300,305,310};
        List<Integer> l1 = new ArrayList<Integer>();
        for(Integer a1:a){
            if(String.valueOf(a1).startsWith("1")){
                l1.add(a1);
            }
        }
        System.out.println("Numbers that are start with digit 1:  "+l1);



    }
}
