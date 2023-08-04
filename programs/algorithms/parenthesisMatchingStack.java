import java.util.EmptyStackException;
import java.util.Stack;

public class parenthesisMatchingStack {
    public static boolean match(String parens) {
        Stack<Character> s = new Stack<Character>();
        for (char c : parens.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                s.push(c);
            }
            else if(c==')'){
                try {
                    char t = s.pop();
                    if(t!='('){
                        return false;
                    }
                } catch (EmptyStackException e) {
                    return false;
                }
            }
            else if(c=='}'){
                try {
                    char t = s.pop();
                    if(t!='{'){
                        return false;
                    }
                } catch (EmptyStackException e) {
                    return false;
                }
            }
            else if(c==']'){
                try {
                    char t = s.pop();
                    if(t!='['){
                        return false;
                    }
                } catch (EmptyStackException e) {
                    return false;
                }
            }
            else{
                return false;
            }
        }
        if(s.empty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(match("((({{{[[[]]]}}})))"));
    }
}
