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
    

    public static void main(String[] args) {
        System.out.println(matchSingleParens("(({[]}))"));
        System.out.println(matchParens("(([]))"));
    }
}
