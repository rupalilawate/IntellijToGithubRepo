package JavaPractice2;

import java.util.Arrays;

public class LeftRotateArrayEle {

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};


        //output:[5,6,1,2,3,4]

        //6,1,2,3,4,5
        //5,6,1,2,3,4

        int n=4;
        for(int i=0; i<n; i++){
            int lastElement =a[a.length-1];
            for(int j=a.length-1; j>0; j--){
                a[j]=a[j-1];

            }
            a[0]=lastElement;
        }
        System.out.println(Arrays.toString(a));







    }
}
