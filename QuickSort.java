
public class QuickSort {

	private int Partition(int sortList[], int left, int right)
	{
		int pivotValue = left + (right-left)/2;
		int i = left, j = right;
		
		while(i<=j)
		{
			while(sortList[i] < sortList[pivotValue])
			{
				i++;
			}
			
			while(sortList[j] > sortList[pivotValue])
			{
				j--;
			}
			
			if(i <= j)
			{
				int tmp = sortList[i];
				sortList[i] = sortList[j];
				sortList[j] = tmp;
				i++;
				j--;
			}
		}
		
		return i;
	}
	
	public void Sort(int sortList[], int left, int right)
	{
		//chose the partition index
		int index = Partition(sortList, left, right);
		
		if(index < right)
		{
			Sort(sortList, index, right);
		}
		
		if(index - 1 > left)
		{
			Sort(sortList, left, index-1);
		}
	}
}
