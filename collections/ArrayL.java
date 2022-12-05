package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayL {
    public static void main(String[] args) {
        ArrayList<String> stuName = new ArrayList<>();
        stuName.add("Adwait");
        stuName.add("A");
        stuName.add("B");
        stuName.add("S");
        stuName.add("r");
        stuName.add("E");
        stuName.add("K");
        stuName.add("p");

        for (String s : stuName) {
            System.out.print(s +" ");
        }
    }

}
