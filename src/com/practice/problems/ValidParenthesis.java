package com.practice.problems;


import java.util.Stack;

class VPSolution{
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '(') {
                stack.push(')');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }

        }
        return stack.isEmpty();
    }
}
public class ValidParenthesis{
    public static void main(String[] args){
        VPSolution obj = new VPSolution();
        System.out.println(obj.isValid("{]()]}"));
    }
}
