package PrograamCodeString;

import java.util.Arrays;

public class MoveNonZeroToLeftArray {

    public static void main(String[] args) {

        int a[] = {1,5,0,4,0,9,8,0};
        int size = a.length;

        int newarry[] = new int[size];
        int index = size-1;
        for(int i=0; i<size; i++){
            if(a[i]!=0){
                newarry[index] = a[i];
                index--;
            }
        }
        System.out.println(Arrays.toString(newarry));

    }
}
