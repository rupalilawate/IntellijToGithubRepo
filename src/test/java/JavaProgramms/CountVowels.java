package JavaProgramms;

import java.util.ArrayList;
import java.util.List;

public class CountVowels {

    public static void main(String[] args) {

        String vowels = "";
        String consonent = "";
        String s1= "Sagar Yamagar";
        int totalLength = s1.length();
        consonent = s1.replaceAll("[aeiou]", "");
        vowels = s1.replaceAll("[^aeiou]", "");
        char ch[] = consonent.toCharArray();
        List<Character> l1 = new ArrayList<Character>();
        for(Character ca:ch){
            l1.add(ca);
        }
        System.out.println("Consenets: "+l1);
        int count = totalLength - vowels.length();
        System.out.println("Total count of Consonent: " + count);
        char chv[] = vowels.toCharArray();
        List<Character> l2 = new ArrayList<Character>();
        for(Character cav:chv){
            l2.add(cav);
        }
        System.out.println("vowels: "+l2);
        int count2 = totalLength - consonent.length();
        System.out.println("Total count of Vowels: " + count2);

    }

}
