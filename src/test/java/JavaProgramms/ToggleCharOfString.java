package JavaProgramms;

public class ToggleCharOfString {

    public static void main(String[] args) {
        String s1 = "Rupali Lawate";

        int length = s1.length();
        char ch[] = s1.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(Character ca:ch){
            if(Character.isLowerCase(ca)){
                sb.append(Character.toUpperCase(ca));
            }
            else{
                sb.append(Character.toLowerCase(ca));
            }
        }

        System.out.println(sb);

    }
}
