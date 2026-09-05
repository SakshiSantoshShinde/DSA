class Solution {
    static int closestNumber(int n, int m) {
        
        int repli=n;
        if(n%m==0)
        {
            return n;
        }
        while(true)
        {
            repli++;
            n--;
            
            if (n % m == 0 && repli % m == 0) {
                if (Math.abs(n) >= Math.abs(repli)) {
                    return n;
                } else {
                    return repli;
                }
            }
            
            if(n%m==0)
            {
                return n;
            }
            if(repli%m==0)
            {
                return repli;
            }
           
        }
    }      
}
