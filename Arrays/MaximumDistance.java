// Given m arrays, and each array is sorted in ascending order. Now you can pick up two integers from two different arrays (each array picks one) and calculate the distance. We define the distance between two integers a and b to be their absolute difference |a-b|. Your task is to find the maximum distance.

// Example 1:
// Input: 
// [[1,2,3],
 // [4,5],
 // [1,2,3]]
// Output: 4
// Explanation: 
// One way to reach the maximum distance 4 is to pick 1 in the first or third array and pick 5 in the second array.

public class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        
        int min=arrays.get(0).get(0);
        int max=arrays.get(0).get(arrays.get(0).size()-1);
        int result=Integer.MIN_VALUE;
        for(int i=1;i<arrays.size();i++)
        {
            List<Integer> list=arrays.get(i);
            int head=list.get(0);
            int tail=list.get(list.size()-1);
            result=Math.max(result,Math.abs(max-head));
            result=Math.max(result,Math.abs(tail-min));
            max=Math.max(max,tail);
            min=Math.min(min,head);
        }
        
        return result;
        
    }
}