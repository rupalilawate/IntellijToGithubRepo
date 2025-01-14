package collectionProgramms;

public class LengthOfLastWord {


    static int LastWordLength(String s){

        String s1 = s.trim();
        int count = 0;
        for(int i=s1.length()-1; i>=0; i--){
            if(s1.charAt(i)!=' '){
                count++;
            }
            else {
                break;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        String s=" fly in the moon ";
        int lenth = LastWordLength(s);
        System.out.println(lenth);

    }



}
