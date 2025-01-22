package collectionProgramms;

import java.util.Arrays;

public class LongestCommonPrefix {


    public static void main(String[] args) {


        String s[] = {"flower", "float", "floor", "flood"};
        Arrays.toString(s);
        String s1=s[0];
        String s2=s[s.length-1];
        int index = 0;
        int size = s1.length();
        while (index<size){
            if(s1.charAt(index)==s2.charAt(index)){
                index++;
            }
            else{
                break;
            }

        }
        System.out.println(s1.substring(0,index));






    }





}
