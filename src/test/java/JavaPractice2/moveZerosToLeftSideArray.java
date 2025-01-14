package JavaPractice2;

import java.util.Arrays;

public class moveZerosToLeftSideArray {


    public static void main(String[] args) {

        int a[] = {2,0,9,0,8,0,0,0,};
        int index = a.length-1;
        int newArray[] = new int[a.length];
        for(int i=a.length-1; i>=0; i--){
            if(a[i]!=0){
                newArray[index]=a[i];
                index--;
            }
        }
        System.out.println(Arrays.toString(newArray));


    }

}
