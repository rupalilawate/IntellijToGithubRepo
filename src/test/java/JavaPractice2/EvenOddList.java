package JavaPractice2;

import java.util.ArrayList;
import java.util.List;

public class EvenOddList {


    public static void main(String[] args) {

        int a[] = {20,30,67,55,21,17,11,77,40,80,100,50};
        List<Object> evenlist = new ArrayList<Object>();
        List<Object> oddlist = new ArrayList<Object>();
        for(int i=0; i<a.length; i++){
            if(a[i]%2==0){
                evenlist.add(a[i]);
            }
            else {
                oddlist.add(a[i]);
            }
        }
        System.out.println("Even List:  "+ evenlist);
        System.out.println("Odd List:  "+ oddlist);



    }

}
