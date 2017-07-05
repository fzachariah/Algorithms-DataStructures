// Given numRows, generate the first numRows of Pascal's triangle.

// For example, given numRows = 5,
// Return

// [
     // [1],
    // [1,1],
   // [1,2,1],
  // [1,3,3,1],
 // [1,4,6,4,1]
// ]





public class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> mainList= new ArrayList<>();
         List<Integer> list=new ArrayList<>();
        if(numRows==0)
        {
            return mainList;
        }
        list.add(1);
        mainList.add(list);
        if(numRows==1)
        {
           return mainList;
        }
        System.out.println(list.toString());
        for(int i=1;i<numRows;i++)
        {
            
            
            List<Integer> temp= new ArrayList<>();
            temp.addAll(list);
            temp.add(0,0);
            temp.add(temp.size(),0);
            list=new ArrayList<Integer>();
            for(int j=0;j<temp.size()-1;j++)
            {
                list.add(temp.get(j)+temp.get(j+1));
                
                
            }
            mainList.add(list);
        }
        
        return mainList;
        
        
    }
}