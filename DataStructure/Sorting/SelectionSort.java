package DataStructure.Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {29,72,98,13,87,66,52,51,36};
        int pointer = 0;

        for (int i = pointer; i < arr.length; i++) {
            for (int j = pointer+1; j < arr.length; j++) {
                if (arr[j] < arr[i]){
                    swap(arr, j, i);
                }
            }
            pointer++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int[] swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}
