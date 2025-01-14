package JavaPractice2;

import java.util.Arrays;

public class LongestCommonPrefix2 {


    public static void main(String[] args) {

        String s[] = {"flower", "float", "flood", "floor"};
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
        String s1 = s[0];
        String s2 = s[s.length-1];
        int index=0;
        while(index<s1.length()){
            if(s1.charAt(index)==s2.charAt(index)){
                index++;
            }
            else
            {
                break;
            }
        }
        System.out.println("Longest common prefix:   "+ s1.substring(0,index));





    }
}
