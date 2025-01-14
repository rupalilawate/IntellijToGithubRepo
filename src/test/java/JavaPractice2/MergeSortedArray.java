package JavaPractice2;

import java.util.Arrays;

public class MergeSortedArray {

    public static void mergeArrays(int num1[],int num2[],int m, int n){
        int k= m+n-1;
        int i=m-1;
        int j=n-1;
        while(j>=0){
            if(i>=0 && num1[i]>num2[j]){
                num1[k]=num1[i];
                k--;
                i--;
            }
            else{
                num1[k]=num2[j];
                j--;
                k--;
            }
        }
    }

    public static void main(String[] args) {
        int num1[]={1,2,3,0,0,0,0,0};
        int num2[]={2,5,6,8,9};
        int m=3;
        int n=5;
        mergeArrays(num1,num2,m,n);
        System.out.println(Arrays.toString(num1));
    }

}
