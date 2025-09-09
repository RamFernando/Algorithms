package QueueAndStackAlgorithms;

import java.util.Stack;

public class StackAlgorithmMatchingParentheses {

    public static boolean hasMatchingParentheses(String s){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '('){
                stack.push(current);
            }else if(current == ')'){
                if (!stack.isEmpty()){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean hasMatchingParentheses2(String s){
        int matchingSymbolTracker = 0;

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '('){
                matchingSymbolTracker++;
            }else if(current == ')'){
                if (matchingSymbolTracker > 0){
                    matchingSymbolTracker--;
                }else {
                    return false;
                }
            }
        }
        return matchingSymbolTracker == 0;
    }

    public static void main(String[] args) {
        System.out.println(hasMatchingParentheses2("((algorithm()))"));
        System.out.println(hasMatchingParentheses2("()(algorithm())"));
        System.out.println(hasMatchingParentheses2("((algorithm))"));
        System.out.println(hasMatchingParentheses2("(algorithm)"));
        System.out.println();
        System.out.println(hasMatchingParentheses2(")(algorithm"));
        System.out.println(hasMatchingParentheses2("(algorithm)))"));
        System.out.println(hasMatchingParentheses2(")()algorithm"));
        System.out.println(hasMatchingParentheses2("((algorithm)"));


    }
}
