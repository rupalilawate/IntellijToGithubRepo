package PrograamCodeString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElementsFromTwoArray {

    public static void main(String[] args) {

        int a[] = {1,2,3,4,5};
        int b[] = {3,9,8,1,2};
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        int index=0;

        List<Integer> l1 = new ArrayList<Integer>();
        while(index<a.length){

            if(a[index]==b[index]){
                l1.add(a[index]);
            }
            index++;
        }
        System.out.println(l1);




    }
}
