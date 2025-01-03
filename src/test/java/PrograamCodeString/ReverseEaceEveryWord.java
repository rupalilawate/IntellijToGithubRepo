package PrograamCodeString;

public class ReverseEaceEveryWord {

    public static void main(String[] args) {

        String s1 = "Innova Solutions";
        String ch[] = s1.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=ch.length-1; i>=0; i--){
            sb.append(ch[i] + " ");
        }
        //System.out.println(sb);
        String reversString = "";
        String str[] = sb.toString().split(" ");
        for(String word:str){
            String reverseword = "";
            for(int i=word.length()-1; i>=0; i--){
                reverseword = reverseword + word.charAt(i);
            }
            reversString = reversString + reverseword + " ";
        }
        System.out.println(reversString);

    }
}
