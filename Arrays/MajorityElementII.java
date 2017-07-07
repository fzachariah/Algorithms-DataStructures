Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times. The algorithm should run in linear time and in O(1) space.


public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> list=new ArrayList<>();
        
        if(nums==null||nums.length==0)
        {
            return list;
        }
        
        int countFirst=0;
        int elementFirst=nums[0];
        int countlast=0;
        int elementLast=nums[0];
        
        int n=nums.length;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==elementFirst)
            {
                countFirst++;
            }
            else if(nums[i]==elementLast)
            {
                countlast++;
            }
            else if(countFirst==0)
            {
                elementFirst=nums[i];
                countFirst=1;
                
            }
            else if(countlast==0)
            {
                elementLast=nums[i];
                countlast=1;
                
            }
            else
            {
                countFirst--;
                countlast--;
                
            }
        }
        
        int countOne=0;
        int countTwo=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==elementFirst)
            {
                countOne++;
            }
            else if(nums[i]==elementLast)
            {
                countTwo++;
            }
        }
        
        if(countOne>n/3)
        {
            list.add(elementFirst);
        }
        if(countTwo>n/3)
        {
             list.add(elementLast);
        }
        
        
        return list;
        
    }
}