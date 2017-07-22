public class Solution {
    public int[] countBits(int num) {
        
        int result[]=new int[num+1];
        
        for(int i=1;i<result.length;i++)
        {
            result[i]=result[(i & i-1)]+1;
        }
        
        return result;
        
    }
}