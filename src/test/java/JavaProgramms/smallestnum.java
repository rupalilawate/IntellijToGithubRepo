package JavaProgramms;

public class smallestnum {

    public static void main(String[] args) {
        int a[] = {3,7,8,9,4,6,77,2};
        int higest = Integer.MIN_VALUE;
        for(Integer a2:a){
            if(a2>higest){
                higest = a2;
            }
        }

        System.out.println(higest);

    }
}
