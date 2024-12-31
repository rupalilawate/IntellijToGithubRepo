package JavaProgramms;

import java.util.ArrayList;
import java.util.List;

public class printVowels {

    public static void main(String[] args) {
        String s1 = "Sagar Yamagar";
        char ch[] = s1.toCharArray();
        int count = 0;
        List<Character> l1 = new ArrayList<Character>();
        for(Character ca: ch){
            if(ca.equals('a') || ca.equals('i') || ca.equals('o') || ca.equals('u') || ca.equals('e')){
                l1.add(ca);
                count++;
            }
        }
        System.out.println("Vowels are: "+l1);
        System.out.println("vowel count is: "+count);
    }
}
