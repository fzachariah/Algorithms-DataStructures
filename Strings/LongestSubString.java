// Given a string, find the length of the longest substring without repeating characters.

// Examples:

// Given "abcabcbb", the answer is "abc", which the length is 3.

// Given "bbbbb", the answer is "b", with the length of 1.

// Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.


public class Solution {
    
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<String,Integer> map=new HashMap<>();
        int count=0,maxCount=0;
        int i=0;
        int j=-1;
        while(i<s.length()){
            
            String val=""+s.charAt(i);
            if(map.containsKey(val))
            {
                int pos=map.get(val);
                if(j==-1 ||pos>j)
                {
                    
                    count=count-(pos-j);
                    j=pos;
                }
                    
            }
            map.put(val,i);
            count++;
            maxCount=Math.max(maxCount,count);
            i++;
            
        }
        return maxCount;
        
    }
}