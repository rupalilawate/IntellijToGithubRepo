package JavaPractice2;

public class Fibonacci2 {

    public static void main(String[] args) {

        int fdigit = 0;
        int sdigit = 1;
        int n=10;
        while(n>0){
            int tdigit = fdigit + sdigit;
            System.out.print(fdigit+"  ");
            fdigit=sdigit;
            sdigit=tdigit;
            n--;
        }



    }


}
