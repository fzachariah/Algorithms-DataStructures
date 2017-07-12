public class Solution {
    
    public int reverse(int x) {
        
        if(x==0)
        {
            return 0;
        }
        
        int temp=Math.abs(x);
        int reverse=0;
        int prev=0;
        while(temp>0)
        {
            prev=reverse;
            int val=temp%10;
            reverse=(reverse*10)+(val);
            if(prev!=(reverse-val)/10){
                return 0;
            }
            temp=temp/10;
        }
        
        if(x<0)
        {
            return -reverse;
        }
        else
        {
            return reverse;
        }
        
        
        
    }
}