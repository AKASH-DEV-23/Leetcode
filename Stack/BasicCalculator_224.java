package Stack;

import java.util.Stack;

public class BasicCalculator_224 {
    public static int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int sign = 1;
        int result = 0;
        int num = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + c - '0';
            } else if (c == '+') {
                result += sign * num;
                num = 0;
                sign = 1;
            } else if (c == '-') {
                result += sign * num;
                num = 0;
                sign = -1;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                sign = 1;
                result = 0;
            } else if (c == ')') {
                result += sign * num;
                num = 0;
                result *= stack.pop();
                result += stack.pop();
            }
        }
        return result + sign * num;
    }

    public static void main(String[] args) {
        String s = " 5+5-15 ";
        System.out.println(calculate(s));
    }
}
