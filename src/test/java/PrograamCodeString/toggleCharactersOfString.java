package PrograamCodeString;

public class toggleCharactersOfString {

    public static void main(String[] args) {

        String s = "Kasturi Abaso Yamgar";
        char ch[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(Character ca:ch){
            if(Character.isLowerCase(ca)){
                sb.append(Character.toUpperCase(ca));
            }
            else if(Character.isUpperCase(ca)){
                sb.append(Character.toLowerCase(ca));
            }
            else {
               sb.append(" ");
            }
        }
        System.out.println(sb);

    }
}
