package JavaPractice2;

public class ArmstrongNumber2 {


    public static void main(String[] args) {
        System.out.println("Stated executing");
        int num = 153;
        int temp= num;
        int count=0;
        while(temp>0){
           temp  = temp/10;
            count++;
        }
        System.out.println("total count of digits in number:  "+count);

        temp=num;
        int sum=0;
        while(temp>0){
            int lastdigit = temp%10;
            System.out.println("Laset digit in number: "+lastdigit);
            sum = (int)(sum + Math.pow(lastdigit,count));
            temp = temp/10;
            System.out.println(temp);
        }
        if(sum==num){
            System.out.println("Number is Armstrong ");
        }
        else {
            System.out.println("Number is not Armstrong number");
        }
    }


}
