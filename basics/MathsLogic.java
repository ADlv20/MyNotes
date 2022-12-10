package basics;

public class MathsLogic {

    /**
     * Count Digits
     * 12345 --> 5
     */
    private int countDigits(int number) {
        int digits = 0;
        while (number != 0) {
            digits++;
            number = number / 10;
        }
        System.out.println("Num of Digits : " + digits);
        return digits;
    }

    /**
     * Reverse number
     * 12345 --> 54321
     */
    public int reverseNumber(int number) {
        int rev_num = 0;
        while (number != 0) {
            rev_num = rev_num * 10 + number % 10;
            number = number / 10;
        }
        System.out.println("Reverse Number : " + rev_num);
        return rev_num;
    }

    /**
     * Check Palindrome
     * 123 4 321
     * 12345 6 54321
     */
    private boolean checkPalindrome(int num) {
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            sum = sum * 10 + temp % 10;
            temp = temp / 10;
        }
        if (sum == num) {
            System.out.println("Number is Palindrome : " + sum);
            return true;
        } else {
            System.out.println("Number is NNNOOOTTT Palindrome : " + sum);
            return false;
        }
    }

    private boolean armstrongNumber(int number) {
        boolean flag = false;
        int temp = number;
        int digits = 0;
        double result = 0.0;
        while (temp != 0){
            temp = temp/10;
            digits++;
        }
        temp = number;

        while (temp != 0){
            result = result + Math.pow(temp%10  ,digits);
            temp = temp/10;
        }
        if ((int) result == number){
            flag = true;
            System.out.println("Number is ARMSTRONG : " + number);
        }
        else
            System.out.println("Number is NOT armstrong : " + number);
        return flag;
    }

    private void printAllDivisors(int number){
        for (int i = 1; i <= number/2; i++) {
            if (number  % i == 0){
                System.out.print(i + ", ");
            }
        }
    }

    private boolean isPrime(int number){
        boolean flag = false;
        if (number == 2){
            return true;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                System.out.println(i + ", ");
                flag = false;
                break;
            }
            else {
                flag = true;
            }
        }
        System.out.println(flag);
        return flag;
    }

    private int greatestCommonDivisor(int a, int b){
        int gcd = 1;
        for (int i = 1; i <a && i<b ; i++) {
            if ( a % i == 0 && b % i == 0  ){
                gcd = i;
            }
        }
        System.out.println(gcd);
        return gcd;
    }

    public static void main(String[] args) {
        MathsLogic mathsLogic = new MathsLogic();
        //mathsLogic.countDigits(12345);
        //mathsLogic.reverseNumber(12345);
        //mathsLogic.checkPalindrome(124321);
        //mathsLogic.armstrongNumber(1634);
        //mathsLogic.printAllDivisors(100);
        //mathsLogic.isPrime(11119);
        mathsLogic.greatestCommonDivisor(66,68);
    }
}
