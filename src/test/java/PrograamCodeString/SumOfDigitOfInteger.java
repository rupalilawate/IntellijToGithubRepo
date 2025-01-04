package PrograamCodeString;

public class SumOfDigitOfInteger {

    public static void main(String[] args) {

        int num=999;
        int sum=0;
        while (num>0){
            int lastdigit = num%10;
            sum = sum + lastdigit;
            num=num/10;
        }
        System.out.println(sum);
    }

}
