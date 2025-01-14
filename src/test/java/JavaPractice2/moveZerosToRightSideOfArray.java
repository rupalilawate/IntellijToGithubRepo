package JavaPractice2;

import java.util.Arrays;

public class moveZerosToRightSideOfArray {


    public static void main(String[] args) {

        int a[]={2,0,8,0,9,0,6,4};
        int newArray[] = new int[a.length];
        int index=0;
        for(int i=0; i<a.length; i++){
            if(a[i]!=0){
                newArray[index]=a[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(newArray));



    }

}
