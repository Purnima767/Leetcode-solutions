class Solution {
    public boolean isHappy(int n) {
        while(n!=1&&n!=4)
        {
        int pro,sum=0;
        int num=n;
        while(num>0)
        {
            int r=num%10;
            pro=r*r;
            sum+=pro;
            num=num/10;
        }
        n=sum;
        }
        return n==1;
     }
}