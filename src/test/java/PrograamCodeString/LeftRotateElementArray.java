package PrograamCodeString;

import java.util.Arrays;

public class LeftRotateElementArray {

    public static void main(String[] args) {


        int a[] = {1,2,3,4,5};
        int n=1;
        for(int i=0; i<n; i++){
            int elelast = a[a.length-1];
            for(int j=a.length-1; j>0; j--){
                a[j]=a[j-1];
            }
            a[0]=elelast;
        }
        System.out.println(Arrays.toString(a));
    }


}
