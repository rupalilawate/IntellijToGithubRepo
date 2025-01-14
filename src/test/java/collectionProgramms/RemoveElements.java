package collectionProgramms;

import java.util.Arrays;

public class RemoveElements {

    public static int removeElements(int a[]){
        int count = 0;
        int val = 9;
        for(int i=0; i<a.length; i++){
            if(a[i]!=val){
                a[count]=a[i];
                count++;
            }
        }
        System.out.println("Array after removing elements:  "+ Arrays.toString(a));
        return count;
    }

    public static void main(String[] args) {
        int a[] = {5,9,6,9,9};
        int count1 = removeElements(a);
        System.out.println("Total array elements are:  "+ count1);

    }
}
