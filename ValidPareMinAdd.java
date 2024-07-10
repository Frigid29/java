//912 leetcode

import java.util.*;
public class ValidPareMinAdd {
    public static int minAdd(String s){
        Stack<Character> stack = new Stack<Character>();
        for(char ch:s.toCharArray()){
            if(ch==')'){
                if(!stack.isEmpty() && stack.peek()=='('){
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }else{
                stack.push(ch);
            }
        }
        return stack.size();
    }
    public static void main(String[] args) {
        String s = "(()))";
        System.out.println(minAdd(s));
    }
}
