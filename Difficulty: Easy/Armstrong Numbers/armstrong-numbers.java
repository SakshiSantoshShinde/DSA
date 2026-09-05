class Solution {
    static boolean armstrongNumber(int n) {
        int no=n;
        int rem=0;
        int sum=0;
        while(no!=0)
        {
            rem=no%10;
            sum=sum+(rem*rem*rem);
            no=no/10;
        }
        if(sum==n)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}