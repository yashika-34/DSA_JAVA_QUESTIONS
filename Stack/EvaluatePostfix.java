
import java.util.*;

public class EvaluatePostfix {

    static int evalPostfix(String exp) {
        Stack<Integer> s = new Stack<>();

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

                if (ch == '+')
                    s.push(b + a);
                else if (ch == '-')
                    s.push(b - a);
                else if (ch == '*')
                    s.push(b * a);
                else if (ch == '/')
                    s.push(b / a);
                else if (ch == '^')
                    s.push((int) Math.pow(b, a));
            }
        }

        return s.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter postfix expression:");
        String exp = sc.nextLine();

        System.out.println("Result: " + evalPostfix(exp));

        sc.close();
    }
}
