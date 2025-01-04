package PrograamCodeString;

public class SwapTwoStrings {

    public static void main(String[] args) {

        String s1 = "Rupali";
        String s2 = "Lawate";

        String s = s1+s2;
        System.out.println("before:   " + s);
        s2 = s.replaceAll(s2,"");
        s1 = s.replaceAll(s1,"");
        System.out.println("s1 = "+ s1);
        System.out.println("s2 = "+ s2);


    }

}
