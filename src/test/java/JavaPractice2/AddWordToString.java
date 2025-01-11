package JavaPractice2;

public class AddWordToString {

    public static void main(String[] args) {

        String s = "Sachin Tendulkar";
        String s1[] = s.split(" ");
        String s2 = "Ramesh";
        StringBuilder sb = new StringBuilder();
        for(String word: s1){
            if(word.equals("Sachin")){
                sb.append(word+" "+s2+" ");
            }
            else {
                sb.append(word);
            }
        }
        System.out.println(sb);
    }
}
