class Solution {
    public int findNumbers(int[] nums) {
     int count=0;
     int ans=0;
     for(int i=0;i<nums.length;i++)
     {
        int temp=nums[i];
        while(temp>0)
        {
            count++;
            temp/=10;
        }
     }
     if(count%2==0)
     {
         ans++;;
    }
    return ans;
    }
}