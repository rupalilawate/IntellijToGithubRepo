package JavaPractice2;

public class CommomElementsFromArray2 {

    public static void main(String[] args) {

        int a[] = {1,2,3,4,5,10};
        int b[] = {5,6,2,8,3,11};
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if(a[i]==b[j]){
                    System.out.print(a[i] +" ");
                }
            }
        }











    }
}
