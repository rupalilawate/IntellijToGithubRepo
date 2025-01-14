package JavaPractice2;

public class SwapTwoString {


    public static void main(String[] args) {
        String s1 = "Kasturi";
        String s2 = "Yamgar";
        String s= s1+ s2;
        System.out.println(s);
        int fistlength = s1.length()-1;
        s1 = s.substring((s.length())-fistlength);
        System.out.println("s1 = "+ s1);
        s2 = s.substring(0,fistlength+1);
        System.out.println("s2 = "+s2);




    }
}
