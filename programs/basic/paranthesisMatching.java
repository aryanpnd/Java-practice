public class paranthesisMatching {
    public static boolean matchSingleParens(String parens){
        int count = 0;
        for(int i = 0; i<parens.length();i++){
            if(parens.toCharArray()[i]=='('){
                count++;
            }else{
                if(count==0){
                    return false;
                }else{
                    count--;
                }
            }
        }
        if(count>0){
            return false;
        }else{
            return true;
        }
    }

    public static boolean matchParens(String parens) {
        int count = 0;
        for (int i = 0; i < parens.length(); i++) {
            char c = parens.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                count++;
            } else {
                if (count == 0) {
                    return false;
                }
                count--;
            }
        }
        return count == 0;
    }

    public static boolean matchParensIII(String parens) {
        int countParen = 0;
        int countCurly = 0;
        int countSquare = 0;
    
        for (int i = 0; i < parens.length(); i++) {
            char c = parens.charAt(i);
            if (c == '(') {
                countParen++;
            } else if (c == '{') {
                countCurly++;
            } else if (c == '[') {
                countSquare++;
            } else if (c == ')') {
                if (countParen == 0) {
                    return false;
                }
                countParen--;
            } else if (c == '}') {
                if (countCurly == 0) {
                    return false;
                }
                countCurly--;
            } else if (c == ']') {
                if (countSquare == 0) {
                    return false;
                }
                countSquare--;
            }
        }
    
        return countParen == 0 && countCurly == 0 && countSquare == 0;
    }
    
    

    public static void main(String[] args) {
        System.out.println(matchSingleParens("(({[]}))"));
        System.out.println(matchParens("(([]))"));
    }
}
