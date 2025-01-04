package PrograamCodeString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StartwithLetterA {


    public static void main(String[] args) {
        String s[] = {"Rupali","Aaarti","Abaso","Kasturi","Raju"};
        int index=0;
        List<String> l1 = new ArrayList<String>();
        for(String s1:s){
            char ca = s1.charAt(index);
            if(ca=='R'){
                l1.add(s1);
            }
        }
        System.out.println(l1);

    }


}
