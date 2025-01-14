package collectionProgramms;

import java.util.Arrays;

public class MergeSortedArr {

    public static void mergeSorted(int num1[],int num2[],int m,int n){
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(j>=0){
            if(i>=0 && num1[i]>num2[j]){
                num1[k]=num1[i];
                k--;
                i--;
            }
            else {
                num1[k]=num2[j];
                j--;
                k--;
            }
        }
        System.out.println("MergeSorted array: "+ Arrays.toString(num1));

    }

    public static void main(String[] args) {
        int []num1= {1,2,3,0,0,0};
        int num2[] = {2,5,6};
        int m=3;
        int n=3;
        System.out.println("Before Sorting and merging array: "+ Arrays.toString(num1));
        mergeSorted(num1,num2,m,n);

    }
}