package PrograamCodeString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountConsonents {

    public static void main(String[] args) {

        String s1= "Rupali Lawate";
        String consonent = s1.replaceAll("[aeiou]","");
        String consonent2 = consonent.replaceAll("\\s","");
        System.out.println("Consonents are:  "+ consonent2);
        char ch[] = consonent2.toCharArray();
        List<Character> list = new ArrayList<Character>();
        for(Character ca:ch){
            list.add(ca);
        }
        System.out.println("Consonents are:  "+list);

    }

}
