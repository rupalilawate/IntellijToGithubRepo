package JavaProgramms;

import java.util.Arrays;

public class ReverseWord {

    public static void main(String[] args) {

        String str = "Meghna jadhav";
        String s1[] = str.split(" ");
        //System.out.println(Arrays.toString(s1));
        StringBuilder sb = new StringBuilder();
        for(int i=s1.length-1; i>=0; i--){
            sb.append(s1[i] + " ");
        }
        //System.out.println(sb);

        String resentence = "";
        String sentence = sb.toString();
        String s2[] = sentence.split(" ");
        for(String word:s2){
            String reword = "";
            for(int i=word.length()-1; i>=0; i--){
                reword = reword + word.charAt(i);
            }
            resentence =  resentence + reword + " ";
        }
        System.out.print(resentence);

    }
}
