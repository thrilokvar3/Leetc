class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int r = 0, sum = 0;
        int n = x;
        while(x>0){
            r = x%10;
            sum = sum + r;
            x = x/10;
        }

        if(n%sum==0){
            return sum;
        }
        else{
            return -1;
        }
    }
}