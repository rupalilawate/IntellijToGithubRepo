package PrograamCodeString;

import java.util.Arrays;

public class ReverseArrayElment {

    public static void main(String[] args) {

        int a[] = {1,2,3,4,5};
        int newarry[] = new int[a.length];
        int index = 0;
        for(int i=a.length-1; i>=0; i--){
            newarry[index] = a[i];
            index++;
        }
        System.out.println(Arrays.toString(newarry));

    }
}
