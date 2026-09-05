class Solution {
    public static int countDigits(int n) {
        int count=0;
        int rem=0;
        while(n!=0)
        {
            rem=n%10;
            count++;
            n=n/10;
        }
        return count;   
    }
}
