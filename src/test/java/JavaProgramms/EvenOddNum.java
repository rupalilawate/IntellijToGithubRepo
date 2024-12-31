package JavaProgramms;

import java.util.ArrayList;
import java.util.List;

public class EvenOddNum {

    public static void main(String[] args) {

        int a[] = {1,2,3,55,100};

        List<Integer> even = new ArrayList<Integer>();
        List<Integer> odd = new ArrayList<Integer>();

        for(Integer num:a){
            if(num % 2 == 0){
                even.add(num);
            }
            else if(num % 1 == 0){
                odd.add(num);
            }
            else{
                System.out.println("Number is not even nor odd");
            }
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
