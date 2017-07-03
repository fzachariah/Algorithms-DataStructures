//Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

//For example,
//Given nums = [0, 1, 3] return 2.

//Note:
//Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?

public class Solution {
    public int missingNumber(int[] nums) {
        
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
        }
        int n=nums.length;
        int result=(n*(n+1))/2;
        if(result==sum)
        {
            return 0;
        }
        else{
            return (result-sum);
        }
    }
}