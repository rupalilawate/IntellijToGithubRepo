package PrograamCodeString;

import java.util.Arrays;

public class CountVowels {

    public static void main(String[] args) {

        String s1 = "Rupali Lawate";
        String vowels = s1.replaceAll("[^aeiou]","");
        System.out.println("vowels are: "+vowels);
        char ch[] = vowels.toCharArray();
        System.out.println("Vowels are: "+ Arrays.toString(ch));

    }
}
