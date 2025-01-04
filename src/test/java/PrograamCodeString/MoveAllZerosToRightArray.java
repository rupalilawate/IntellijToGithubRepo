package PrograamCodeString;

import java.util.Arrays;

public class MoveAllZerosToRightArray {

    public static void main(String[] args) {

        int a[] = {0,1,2,0,3,0,6,5,0,7,9};

        int newarry[] = new int[a.length];
        int index = 0;
        for(int i=0; i<a.length; i++){
            if(a[i]!=0){
                newarry[index]=a[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(newarry));

    }

}
