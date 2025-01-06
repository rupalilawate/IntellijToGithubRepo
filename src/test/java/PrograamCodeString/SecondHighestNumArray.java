package PrograamCodeString;

import java.util.Arrays;

public class SecondHighestNumArray {

    public static void main(String[] args) {

        int a[]={33,80,90,44,55,21,41};
        int temp;

        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }
        }
        System.out.println("Second Largest number is: "+ a[1]);






    }



}
