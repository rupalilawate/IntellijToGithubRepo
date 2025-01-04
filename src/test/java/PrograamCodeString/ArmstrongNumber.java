package PrograamCodeString;

public class ArmstrongNumber
{
    public static void main(String[] args) {

        int num=153;
        int count=0;
        int temp=num;

        while(temp>0){
            temp = temp/10;
            count++;
        }
        //System.out.println(count);
        temp=num;
        int sum=0;
        while(temp>0){
            int lastdigit = temp%10;
            System.out.println(lastdigit);
            sum = (int) (sum + Math.pow(lastdigit,count));
            temp=temp/10;
            System.out.println("  __________"+temp);
        }
        if(sum==num){
            System.out.println("The number is Armstrong");
        }
        else{
            System.out.println("Number is not Armstrong");
        }

    }

}
