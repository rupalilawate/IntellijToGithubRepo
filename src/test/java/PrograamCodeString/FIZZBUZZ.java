package PrograamCodeString;

import java.util.ArrayList;
import java.util.List;

public class FIZZBUZZ {

    public static void main(String[] args) {

        int num = 15;

        List<Object> l1 = new ArrayList<Object>();
        for(int i=1; i<num; i++){

            if(i%3==0 && i%5==0){
                l1.add("FIZZBUZZ");
            }
            else if(i%3 == 0)
            {
                l1.add("FIZZ");

            }
            else if(i%5 == 0){
                l1.add("BUZZ");
            }
            else{
                l1.add(i);
            }

        }
        System.out.println(l1);

    }
}
