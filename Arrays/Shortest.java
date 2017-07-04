
// Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order, too.

// You need to find the shortest such subarray and output its length.

// Example 1:
// Input: [2, 6, 4, 8, 10, 9, 15]
// Output: 5

public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        
        int beg=-1;
        int end=-2;
        int min=nums[nums.length-1];
        int max=nums[0];
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
                beg=nums.length-1-i;
            }
        }
        
        
        
        return (end-beg)+1;
        
        
    }
}