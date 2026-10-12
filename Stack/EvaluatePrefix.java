import java.util.Stack;

public class EvaluatePrefix {
    static int evalPostfix(Stack<Integer> s, String exp) {
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == ' ') {
                continue;
            }

            if (Character.isDigit(ch)) {
                s.push(ch - '0');
            } else {
                int a = s.pop();
                int b = s.pop();

                if (ch == '+') s.push(b + a);
                else if (ch == '-') s.push(b - a);
                else if (ch == '*') s.push(b * a);
                else if (ch == '/') s.push(b / a);
                else if (ch == '^') s.push((int) Math.pow(b, a));
                else {
                    throw new IllegalArgumentException("Invalid operator: " + ch);
                }
            }
        }

        return s.pop();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        String expression = "23+5*";
        System.out.println(evalPostfix(stack, expression));
    }
}