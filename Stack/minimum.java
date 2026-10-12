import java.util.*;

public class minimum {
    public static int min(Stack<Integer> s) {
        int minimum = Integer.MAX_VALUE;

    while (!s.isEmpty()) {
        int x = s.pop();

        if (x < minimum) {
            minimum = x;
        }
    }

    return minimum;
}
}
