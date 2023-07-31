import java.util.Scanner;

public class stringOperation {

    public static String replaceChar(String str, char charToReplace, char charToReplaceWith) {
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == charToReplace) {
                temp = temp + charToReplaceWith;
            } else {
                temp = temp + str.charAt(i);
            }
        }
        return temp;
    }

    // reverse string O(n)
    public static StringBuilder reverseString(String str){
        StringBuilder temp = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--) {
            temp.append(str.charAt(i));
        }
        return temp;
    }

    // reverse string O(n/2)
    public static StringBuilder reverseString2(String str){
        StringBuilder temp = new StringBuilder(str);
        for (int i = 0; i < temp.length()/2; i++) {
            char left = temp.charAt(i);
            char right = temp.charAt(temp.length()-1-i);
            temp.setCharAt(i, right);
            temp.setCharAt(temp.length()-1-i, left);
        }
        return temp;
    }

    // find and replace string
    public static String FindAndReplace(String str, String stringToReplace, String stringToReplaceWith) {
        String tempStr = "";
        int startIndex = -1; // Initialize startIndex to -1 (not found)
        int endIndex = str.length();

        // here we are seaching the index of stringToReplace in str , the alternative
        // way is using str.indexOf(stringToReplace)
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == stringToReplace.charAt(0)) {
                int tempInt = 0;
                for (int j = 0; j < stringToReplace.length(); j++) {
                    if (str.charAt(i + j) == stringToReplace.charAt(j)) {
                        tempInt = tempInt + 1;
                    } else {
                        break;
                    }
                }
                if (tempInt == stringToReplace.length()) {
                    startIndex = i;
                }
            }
            tempStr = tempStr + str.charAt(i);
        }

        // here we are replacing it
        if (startIndex >= 0) {
            String startStr = str.substring(0, startIndex);
            String endStr = str.substring(startIndex + stringToReplace.length());
            System.out.println(stringToReplace.length());

            return startStr+ stringToReplaceWith + endStr;
        } else {
            return "string not found";
        }

    }

    public static void main(String[] args) {
        String str = "hello world";

        // remember "" are for strings and ''are for characters
        System.out.println(replaceChar(str, 'h', 'j'));
        System.out.println(reverseString(str));
        System.out.println(reverseString2(str));
        System.out.println(FindAndReplace(str, "world", "universe")); 
    }
}
