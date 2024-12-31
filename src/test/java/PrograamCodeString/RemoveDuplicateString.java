package PrograamCodeString;

import java.util.HashSet;

public class RemoveDuplicateString {
    public static void main(String[] args) {

        String s1 = "goodMorning";
        char ch[] = s1.toCharArray();
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<Character>();
        for(Character ca:ch){
            if(set.add(ca)){
                sb.append(ca);
            }
        }
        System.out.println(sb);
    }
}
