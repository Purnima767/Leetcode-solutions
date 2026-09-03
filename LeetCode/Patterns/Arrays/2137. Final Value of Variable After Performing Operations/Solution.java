class Solution {
    public int finalValueAfterOperations(String[] operations) {
       int res=0;
       for(String op:operations)
       {
        if(op.charAt(1)=='+')
        {
            res+=1;
        }
        else
        {
            res-=1;
        }
    }
    return res; 
       }
}