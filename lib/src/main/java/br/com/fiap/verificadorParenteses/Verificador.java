package br.com.fiap.verificadorParenteses;

import java.util.Stack;

public class Verificador {
	public static boolean validateParentheses(String input) {
		Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char open = stack.pop();
                if (!((open == '(' && c == ')') || (open == '{' && c == '}') || (open == '[' && c == ']'))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
	}

}
