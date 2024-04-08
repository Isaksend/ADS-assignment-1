package tasks;
import java.util.Scanner;
/*
    Recursive method to check if all characters in the string are digits.
    	The code recursively checks each character in the input string,
    	so the time complexity is linear, O(n), where n is the length of the input string.
 */
public class DigitChecker {
    public static boolean isNum(String str, int index){
        // Base case: if we've reached the end of the string without finding a non-digit character, return true.
        if (index == str.length()){
            return true;
        }
        // Check the character at the current index. If it's not a digit, return false.
        if (!Character.isDigit(str.charAt(index))){
            return false;
        }
        // Recur for the next character.
        return isNum(str,index+1);
    }
    // Overloaded method to start the recursive checking from the beginning of the string.
    public static boolean isNum(String str){
        return isNum(str,0);
    }
}
