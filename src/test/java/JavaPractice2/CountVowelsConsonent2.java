package JavaPractice2;

public class CountVowelsConsonent2 {

    public static void main(String[] args) {

        String s = "RuAplI LawAtE";
        int totalLength = s.length();
        String vowels = s.replaceAll("[^aeiouAEIOU]","");
        System.out.println("vowels------>  "+vowels);
        System.out.println("Count of vowels:  "+vowels.length());
        String consonents = s.replaceAll("[AEIOUaioue\s]","");
        System.out.println(consonents);
        System.out.println("Consonent count:  "+consonents.length());




    }




}
