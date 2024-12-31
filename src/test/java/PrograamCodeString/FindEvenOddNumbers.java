package PrograamCodeString;

public class FindEvenOddNumbers {

    public static void main(String[] args) {

       String s1 = "Sagar Yamagar";
       char ch[] = s1.toCharArray();
       StringBuilder sb = new StringBuilder();
       int count=0;
       for(Character ca: ch){
           if(Character.isLowerCase(ca)){
               sb.append(Character.toUpperCase(ca));
               count++;
           }
           else if(Character.isUpperCase(ca)){
              sb.append(Character.toLowerCase(ca));
              count++;
           }
           else{
               sb.append(" ");
           }
       }
        System.out.println(sb);
        System.out.println("Total toggle character are: " + count);

    }
}
