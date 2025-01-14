package JavaPractice2;

public class Reverseeveryword {


    public static void main(String[] args) {

        String s= "I am doing java Programming";
        String s2[] = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(String word:s2){
            String revWord="";
            for(int i=word.length()-1; i>=0; i--){
                revWord = revWord + word.charAt(i);
            }
            sb.append(revWord + " ");
        }
        System.out.println(sb);




    }

}
