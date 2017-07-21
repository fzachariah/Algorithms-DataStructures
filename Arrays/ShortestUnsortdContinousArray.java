public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        
        if(nums.length==1)
        {
            return 0;
        }
        
        int beg=-1;
        int end=-2;
        
        int max=nums[0];
        int min=nums[nums.length-1];
        
        
        for(int i=1;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[nums.length-1-i]);
            
            if(max>nums[i])
            {
                end=i;
            }
            
            if(min<nums[nums.length-1-i])
            {
                beg=nums.length-i-1;
            }
            
            
        }
        
        return (end-beg)+1;
        
        
        
    }
}