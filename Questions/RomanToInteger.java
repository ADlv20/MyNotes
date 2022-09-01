package Questions;

import java.util.Dictionary;
import java.util.Hashtable;

/**
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

 <p>For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

 <ul>
    <li>I can be placed before V (5) and X (10) to make 4 and 9.</li>
    <li>X can be placed before L (50) and C (100) to make 40 and 90.</li>
    <li>C can be placed before D (500) and M (1000) to make 400 and 900.</li>
 </ul>



Given a roman numeral, convert it to an integer.
<ul>
 <li>Example 1:
 Input: s = "III"
 Output: 3
 Explanation: III = 3.</li>
 <li>Example 2:
 Input: s = "LVIII"
 Output: 58
 Explanation: L = 50, V= 5, III = 3.</li>
 <li>Example 3:
 Input: s = "MCMXCIV"
 Output: 1994
 Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.</li>
 </ul>

Constraints:
1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].

*/
public class RomanToInteger {

    /**First Try
     public static void main(String[] args) {
        RomanToInteger rti = new RomanToInteger();
        int num = rti.romanToInteger("I");
        System.out.println(num);
    }
    public int romanToInteger(@NotNull String s){
        int num = 0;
        for (int i=0; i < s.length(); i++){
            if (s.charAt(i) == 'V' && s.charAt(i-1) == 'I'){
                num += 5;
                num--;
            }
        }
        return num;
    }*/

    public static void main(String[] args) {
        int result = romanToInt("XV");
        System.out.println(result);
    }

    public static int romanToInt(String s){
        Dictionary<Character, Integer> romnumDict = new Hashtable<Character, Integer>();
        romnumDict.put('I', 1);
        romnumDict.put('V', 5);
        romnumDict.put('X', 10);
        romnumDict.put('L', 50);
        romnumDict.put('C', 100);
        romnumDict.put('D', 500);
        romnumDict.put('M', 1000);

        int result=0;
        int currValue, nextValue;

        for (int i=0; i < s.length(); i++){
            currValue = romnumDict.get(s.charAt(i));

            if (i != s.length()-1){
                nextValue = romnumDict.get(s.charAt(i+1));
                if (currValue < nextValue){
                    currValue = nextValue - currValue;
                    i++;
                }
            }
            result += currValue;
        }
        return result;
    }
}
