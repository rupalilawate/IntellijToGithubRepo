package JavaPractice2;

import java.util.Arrays;

public class MoveAllnonzerostoRight {

    public static void main(String[] args) {
        int a[]={1,2,0,3,0,5,0};
        int b[]=new int[a.length];
        int index= 0;
        for(int i=0; i<a.length-1; i++){
            if(a[i]!=0){
                b[index]=a[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(b));

    }
}
