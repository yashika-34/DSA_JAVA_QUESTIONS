import java.util.*;

static int evalPostfix(Stack s, String exp) {
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
        }
    }

    return s.pop();
}