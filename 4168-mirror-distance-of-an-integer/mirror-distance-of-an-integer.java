class Solution {
    public int mirrorDistance(int n) 
    {
        int t=n;
        int k=0;
        while(t>0)
        {
            int r=t%10;
            t=t/10;
            k=k*10+r;
        }  
        return Math.abs(n-k);
    }
}