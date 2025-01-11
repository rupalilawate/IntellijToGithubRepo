package JavaPractice2;

public class CountOfCapitalizewords {


    public static void main(String[] args) {


        String s= "RupalisagarBharatyamgarLawate";
//        int count=0;
//        for(int i=0; i<s.length(); i++){
//            if(s.charAt(i) >='a' && s.charAt(i) <='z'){
//                count++;
//            }
//        }
//        System.out.println(count);

        int totallength = s.length();

        String vowels = s.replaceAll("[^aioueAIOUE]","");
        System.out.println(vowels);
        int replacelength = vowels.length();

        //int count = totallength-replacelength;
        System.out.println(replacelength);



    }
}
