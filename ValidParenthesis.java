import java.util.*;
public class ValidParenthesis {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<Character>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()) return false;
                if(ch==')' && stack.pop()!='('){
                    return false;
                }
                if(ch==']' && stack.pop()!='['){
                    return false;
                }
                if(ch=='}' && stack.pop()!='{'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s="({[()]})";
        System.out.println(isValid(s));
    }
}
