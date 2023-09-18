package testing;

import java.util.ArrayList;

public class CodeTesting {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();


        int[] arr = {1, 2, 3, 1, 4, 5 ,2 ,3, 6};

        for(int i = 0; i< arr.length - 2; i++){
            a.add(Math.max(arr[i+2], Math.max(arr[i],arr[i+1])));
        }

        System.out.println(a);
    }
}
