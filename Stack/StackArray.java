
public class StackArray {
   private int maxSize;
   private int[] stackArray;
   private int top;

   public StackArray(int var1) {
      this.maxSize = var1;
      this.stackArray = new int[var1];
      this.top = -1;
   }

   public boolean isFull() {
      return this.top == this.maxSize - 1;
   }

   public boolean isEmpty() {
      return this.top == -1;
   }

   public void push(int var1) {
      if (this.isFull()) {
         throw new IllegalStateException("Stack is full");
      } else {
         this.stackArray[++this.top] = var1;
      }
   }

   public int pop() {
      return this.isEmpty() ? -1 : this.stackArray[this.top--];
   }

   public int getMin() {
      if (this.isEmpty()) {
         return -1;
      } else {
         int var1 = this.stackArray[0];

         for(int var2 = 1; var2 <= this.top; ++var2) {
            if (this.stackArray[var2] < var1) {
               var1 = this.stackArray[var2];
            }
         }

         return var1;
      }
   }
}
