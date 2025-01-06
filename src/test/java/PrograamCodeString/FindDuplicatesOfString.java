package PrograamCodeString;

import java.util.HashMap;

public class FindDuplicatesOfString {

    public static void main(String[] args) {

        String s="captain america";
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        char ch[]=s.toCharArray();
        for(Character ca:ch){
            if(map.containsKey(ca)){
                map.put(ca,map.get(ca)+1);
            }
            else{
                map.put(ca,1);
            }
        }
        for(Character ca:map.keySet()){
            if(map.get(ca)>1){
                System.out.println(ca + " ...... =  "+ map.get(ca));
            }
        }




    }
}
