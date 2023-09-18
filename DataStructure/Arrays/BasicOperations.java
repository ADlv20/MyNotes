package DataStructure.Arrays;

public class BasicOperations {

    // Searching in an Array
    // Returns index if found -1 if not found
    private int searchElementInArray(int[] arr, int target){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    // Return largest element
    private int largestElementInArray(int[] arr){
        int largest = 0;

        for (int i : arr) {
            if (i > largest) {
                largest = i;
            }
        }
        return largest;
    }

    // Return 2nd Largest Element
    private int secondLargestInArray(int[] arr){
        int largest = 0;
        int largestIndex = 0;
        int secondLargest = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>largest){
                largest = arr[i];
                largestIndex = i;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && i != largestIndex && largest != arr[i]){
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    // 2nd Largest GFG Approach
    private int secondLargestInArrayEfficient(int[] arr){
        int res = -1;
        int largest = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[largest]){
                res = largest;
                largest = i;
            }

            else if (arr[i] != arr[largest]){
                if (res == -1 || arr[i] > arr[res]){
                    res = i;
                }
            }
        }
        return arr[res];
    }

    public static void main(String[] args) {
        BasicOperations bo = new BasicOperations();

        int[] arr = {1, 2, 3, 4, 5, 43, 45, 7, 45};

        // System.out.println(bo.searchElementInArray(arr,0));
        // System.out.println(bo.searchElementInArray(arr,2));
        // System.out.println(bo.largestElementInArray(arr));

        System.out.println(bo.secondLargestInArrayEfficient(arr));
    }
}
