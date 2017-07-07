Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements that appear twice in this array.

Could you do it without extra space and in O(n) runtime?

Example:
Input:
[4,3,2,7,8,2,3,1]

Output:
[2,3]


public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> arraylist=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            //System.out.println(nums[i]);
           int val=Math.abs(nums[i])-1; ;
            if(nums[val]<0)
            {
                arraylist.add(Math.abs(nums[i]));
                continue;
            }
            nums[val]=-nums[val];
        }
        
        return arraylist;
        
    }
}