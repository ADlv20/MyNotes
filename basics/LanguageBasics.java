package basics;

import java.util.Scanner;

public class LanguageBasics {

    public static void main(String[] args) {
        int num = 5;
        float aFloat = 2.2f;
        double aDouble = 2.9;
        boolean trueFalse = true;
        char character = 'a';
        String str = "AD";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int s = scanner.nextInt();
        printValue(s,aDouble,aFloat);
        loops();
    }

    private static void printValue(int num, double aDouble, float aFloat){
        if (num>10)
            System.out.println(aDouble + aFloat);
        else
            System.out.println(aDouble - aFloat);
    }

    private static void loops(){
        for (int i=0; i<3; i++){
            System.out.println("For Loop : " +i);
        }

        int whileI=0;
        while(whileI<3){
            System.out.println("While Loop : " + whileI);
            whileI++;
        }
    }

}
