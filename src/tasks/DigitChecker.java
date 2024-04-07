package tasks;
import java.util.Scanner;

public class DigitChecker {
    public static boolean isNum(String str, int index){
        if (index == str.length()){
            return true;
        }
        if (!Character.isDigit(str.charAt(index))){
            return false;
        }
        return isNum(str,index+1);
    }
    public static boolean isNum(String str){
        return isNum(str,0);
    }

}
