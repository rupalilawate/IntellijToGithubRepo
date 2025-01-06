package PrograamCodeString;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountNumberOfCharactersInString {

    public static void main(String[] args) {

        String s= "captain america";
        char ch[] = s.toCharArray();
        int count=0;
        for(Character ca:ch){
            if(ca!=' '){
                count++;
            }
        }
        int commonChar=0;
        Set<Character> set = new HashSet<>();
        List<Character> l1 = new ArrayList<Character>();
        for(Character ca:ch){
            if(set.add(ca)==false){
                l1.add(ca);
                commonChar++;
            }
        }
        System.out.println("Common Character count: "+ commonChar);
        System.out.println(l1);

        System.out.println("Total Chracters count:" + count);

    }

}
