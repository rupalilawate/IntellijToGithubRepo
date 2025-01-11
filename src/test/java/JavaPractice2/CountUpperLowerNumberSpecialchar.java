package JavaPractice2;

public class CountUpperLowerNumberSpecialchar {

    public static void main(String[] args) {


        String s = "DFGSDF)(*&^%$#@!asdfghjklk5263695258";
        int uppercase=0, lowercase=0, numbers=0, specialcharcter=0;

        for(int i=0; i<s.length(); i++){
            char ca = s.charAt(i);
            if(ca>='A' && ca<='Z'){
                uppercase++;
            }
            else if(ca>='a' && ca<='z'){
                lowercase++;
            }
            else if(ca>='0' && ca<='9'){
                numbers++;
            }
            else {
                specialcharcter++;
            }
        }
        System.out.println("UpperCase Letter Count:  " + uppercase);
        System.out.println("LowerCase Letter Count:  " + lowercase);
        System.out.println("Numbers  Count:  " + numbers);
        System.out.println("SpecialCharacter  Count:  " + specialcharcter);



    }

}
