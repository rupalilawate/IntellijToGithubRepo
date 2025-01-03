package PrograamCodeString;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicatesRemoved {

    public static void main(String[] args) {

        String s1 = "captain america";
        char ch[] = s1.toCharArray();
        Set<Character> set = new LinkedHashSet<Character>();
        StringBuilder sb = new StringBuilder();
        for(Character ca:ch){
            if(set.add(ca)){
                sb.append(ca);
            }
        }
        System.out.println(sb);

    }
}
