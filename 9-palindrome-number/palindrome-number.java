class Solution {
    public boolean isPalindrome(int x) {
        int dig = 0;
        int rev = 0;
        int m = x;
        while(x>0){
            dig = x % 10;
            rev = rev*10 + dig;
            x = x / 10;
        }
        if(m == rev) return true;
        return false;
    }
}