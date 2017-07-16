public class Solution {
    
    public double findMaxAverage(int[] nums, int k) {
        
        double resultMax=Integer.MIN_VALUE;;
        double max=0;
        int val=0;
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(val<k)
            {
                val++;
                max=max+nums[i];
                if(val==k)
                {
                    if((max/k)>resultMax)
                    {
                    resultMax=max/k;
                    } 
                    val=k+1;
                }
            }
            
            else
            {
                max=max-nums[j];
                j++;
                max=max+nums[i];
                if((max/k)>resultMax)
                {
                      resultMax=max/k;
                } 
            }
        }
        
        return resultMax;
        
    }
}