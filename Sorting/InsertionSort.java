public class Solution {
    
    public void insertionSort(int ar[],int n) {
		
		for(int i=1;i<n;i++)
		{
			int key=ar[i];
			j=i-1;
			while(j>0 && ar[j]>key)
			{
				ar[j+1]=ar[j];
				j--;
			}
			ar[j+1]=key;
		}
		
		
	}
}