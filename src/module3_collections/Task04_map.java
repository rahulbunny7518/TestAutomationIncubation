package module3_collections;

import java.util.Scanner;
import java.util.Stack;

public class Task04_map {
	
	private static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            switch (ch) {
                case '{':
                case '(':
                case '[':
                    stack.push(ch);
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
            }
        }
 
        return stack.isEmpty();
    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            System.out.println(isBalanced(input) ? "true" : "false");
        }
 
        scanner.close();
    }
}
