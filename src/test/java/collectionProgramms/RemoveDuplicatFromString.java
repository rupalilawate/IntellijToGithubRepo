package collectionProgramms;

import java.util.HashSet;
import java.util.Locale;

public class RemoveDuplicatFromString {


    public static void main(String[] args) {

        String s = "AutomationJava";
        String s2 = s.toLowerCase();
        char ch[] = s2.toCharArray();
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (Character ca: ch){
            if(set.add(ca)){
                sb.append(ca);
            }
        }
        System.out.println(sb);
    }
}
