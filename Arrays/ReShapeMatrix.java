In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different size but keep its original data.

You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.

The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

Example 1:
Input: 
nums = 
[[1,2],
 [3,4]]
r = 1, c = 4
Output: 
[[1,2,3,4]]
Explanation:
The row-traversing of nums is [1,2,3,4]. The new reshaped matrix is a 1 * 4 matrix, fill it row by row by using the previou




public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        
        int result=r*c;
        int product=nums.length*(nums[0].length);
        int row=nums.length;
        int col=nums[0].length;
        if(product!=result)
        {
            return nums;
        }
        int resultNums[][]=new int[r][c];
        int p=0;
        int q=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                resultNums[i][j]=nums[p][q];
                q++;
                if(q==col)
                {
                    p++;
                    q=0;
                }
            }
        }
         return resultNums;
        
    }
   
}