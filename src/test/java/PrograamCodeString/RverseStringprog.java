package PrograamCodeString;

public class RverseStringprog {

    public static void main(String[] args) {

        String s = "Kasturi Abaso Yamgar";
        String words[] = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(String word:words){

            if(word.equals("Abaso")){
                String s2 = "";
                for(int i=word.length()-1; i>=0; i--){
                    s2 = s2 + word.charAt(i);
                }
                sb.append(s2+" ");
            }
            else {
                sb.append(word + " ");
            }

        }
        System.out.println(sb);
    }
}
