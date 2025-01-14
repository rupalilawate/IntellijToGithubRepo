package JavaPractice2;

import java.util.HashSet;

public class removeDuplicates2 {


    public static void main(String[] args) {

        String s="Automation";
        char ch[] = s.toLowerCase().toCharArray();
        HashSet<Character> set = new HashSet<Character>();
        StringBuilder sb = new StringBuilder();
        for(Character ca:ch){
            if(set.add(ca)==true){
                sb.append(ca);
            }
        }
        System.out.println(sb);






    }
}
