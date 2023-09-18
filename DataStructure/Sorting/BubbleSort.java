package DataStructure.Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {6,2,8,4,10};
        bubbleSort(arr, 3);
    }

    public static void bubbleSort(int[] arr, int n) {

        for(int i = 0; i < arr.length; i++){

            for(int j = 0; j < arr.length-1; j++){

                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
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
