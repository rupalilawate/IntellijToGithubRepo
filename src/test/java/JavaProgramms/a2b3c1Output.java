package JavaProgramms;

import java.util.HashMap;

public class a2b3c1Output {

    public static void main(String[] args) {
        String s1 = "aaabbccccddd";
        char[] ch= s1.toCharArray();
        HashMap<Character,Integer> m1 = new HashMap<Character,Integer>();
        for(Character ca: ch){
            if(m1.containsKey(ca)){
                m1.put(ca,m1.get(ca)+1);
            }
            else{
                m1.put(ca,1);
            }
        }
        for(Character key:m1.keySet()){
            System.out.print(key+""+m1.get(key));
        }
    }


}
