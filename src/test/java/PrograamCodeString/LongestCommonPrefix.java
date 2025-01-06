package PrograamCodeString;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String s[] ={"flower","float","flight"};
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
        String s1 = s[0];
        String s2 = s[s.length-1];
        int index=0;
        while (index<s1.length()){
            if(s1.charAt(index)==s2.charAt(index))
            {
                index++;
            }
            else
            {
                break;
            }
        }
        if(index!=0){
            System.out.println(s1.substring(0,index));
        }
        else{
            System.out.println("No Longest common prefix in given strings");
        }





    }
}
