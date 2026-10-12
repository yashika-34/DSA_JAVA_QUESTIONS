public class StackArray {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackArray(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int j) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        stackArray[++top] = j;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        return stackArray[top--];
    }

    public int getMin() {
        if (isEmpty()) {
            return -1;
        }
        int minima = stackArray[0];
        for (int i = 1; i <= top; i++) {
            if (stackArray[i] < minima) {
                minima = stackArray[i];
            }
        }
        return minima;
    }
}