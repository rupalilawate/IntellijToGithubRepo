package JavaPractice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicateEleminArray {


    public static void main(String[] args) {

        int a[]={1,5,1,2,4,2,5,6,7,8,9,8};
        List<Integer> l1 = new ArrayList<Integer>();
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]==a[j]){
                    l1.add(a[i]);
                }
            }
        }
        System.out.println("Original array is "+ Arrays.toString(a));
        System.out.println("Duplicate elements from array  "+ l1);
    }
}
