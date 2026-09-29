class Solution {
    public boolean isPalindrome(int x) {
        int reverse=0;
        int original=x;
        while(x>0){
            int digit=x%10;
            reverse=reverse*10+digit;
            x/=10;

        }
        return reverse==original;
        
    }
}