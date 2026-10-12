
public class InfixtoPostfix {
    static class CQStack {
        public int maxSize;
        public char[] stackArray;
        public int top;

        public CQStack(int s) {
            maxSize = s;
            stackArray = new char[maxSize];
            top = -1;
        }

        public boolean isEmpty() {
            return (top == -1);
        }

        public boolean isFull() {
            return (top == maxSize - 1);
        }

        public void push(char j) {
            if (!isFull()) {
                stackArray[++top] = j;
            }
        }

        public char pop() {
            if (isEmpty()) {
                return '\0';
            }
            return stackArray[top--];
        }
    }

    static String infixToPostfix(CQStack s, String exp) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                output.append(ch);
            } else if (ch == '(') {
                s.push(ch);
            } else if (ch == ')') {
                while (!s.isEmpty()) {
                    char top = s.pop();
                    if (top == '(') {
                        break;
                    }
                    output.append(top);
                }
            } else {
                while (!s.isEmpty()) {
                    char top = s.pop();
                    if (top == '(') {
                        s.push(top);
                        break;
                    }
                    if (precedence(top) > precedence(ch) ||
                        (precedence(top) == precedence(ch) && ch != '^')) {
                        output.append(top);
                    } else {
                        s.push(top);
                        break;
                    }
                }
                s.push(ch);
            }
        }
        while (!s.isEmpty()) {
            output.append(s.pop());
        }
        return output.toString();
    }

    static int precedence(char ch) {
        if (ch == '^')
            return 3;
        if (ch == '*' || ch == '/' || ch == '%')
            return 2;
        if (ch == '+' || ch == '-')
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        CQStack stack = new CQStack(20);
        String expression = "a+b*c";
        System.out.println(infixToPostfix(stack, expression));
    }
}