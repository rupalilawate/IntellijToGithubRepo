package JavaPractice2;

import java.util.HashMap;

public class a2b3c1d2 {

    static void occuranceOfCharacters(String s1){

        HashMap<Character,Integer> m1 = new HashMap<Character,Integer>();
        char ch[] = s1.toCharArray();
        for(Character ca:ch){
            if(m1.containsKey(ca)){
                m1.put(ca,m1.get(ca)+1);
            }
            else {
                m1.put(ca,1);
            }
        }
        for(Character key:m1.keySet()){
            System.out.print(key+""+m1.get(key));
        }
    }


    public static void main(String[] args) {
        String s1 = "aaabbbbcdd";
        occuranceOfCharacters(s1);
    }


}
