package leetCode;

public class RunningSum {

    public static void main(String[] args) {

        int num[] = {1,2,3,4,5};
        int arr[] = runningSumOp(num);
        for (int j : arr) {
            System.out.println(j);
        }
    }

    public static int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i = 1; i<= nums.length; i++){
            for (int j = 0; j <= nums.length; j++) {
                if (j<i){
                    arr[i-1] +=  nums[j];
                }
            }
        }
        return arr;
    }

    public static int[] runningSumOp(int[] num) {
        for(int i=1; i<num.length; i++){
            num[i]=num[i]+num[i-1];
        }
        return num;
    }
}
