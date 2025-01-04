package PrograamCodeString;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {

    public static void main(String[] args) {

        int n=10;
        int firstno = 0;
        int secodno = 1;

        System.out.print(firstno+" ");
        for(int i=1; i<n; i++){
            int nextno = firstno + secodno;
            firstno=secodno;
            secodno=nextno;
            System.out.print(secodno+" ");
        }


    }
}
