package JavaPractice2;

public class reverseNumber2 {


    public static void main(String[] args) {

        int num = 98;
        while (num>0){
            int lastdigit = num%10;
            System.out.print(lastdigit);
            num = num/10;
        }





    }
}
