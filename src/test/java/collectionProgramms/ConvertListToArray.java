package collectionProgramms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListToArray {

    public static void convertToArray(List<String> l1){
        String s1[] = l1.toArray(new String[0]);
        System.out.println(Arrays.toString(s1));

    }

    public static void main(String[] args) {
        List<String> l1 = new ArrayList<String>();
        l1.add("Rupali");
        l1.add("SAM");
        l1.add("Sagar");
        l1.add("Raju");
        l1.add("Sham");
        convertToArray(l1);
    }


}
