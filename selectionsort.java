package array;

public class selectionsort {
	
	public static void main(String[]  arg)
	{
		int ar[]= {1,45,64,32,78,23};
		int l=ar.length;
		int min=0;
		int i,j;
		int temp;
		//selection sort starting
		for(i=0;i<l-1;i++)
		{
			min=i;
		
			for(j=i+1;j<l;j++)
			{
				if(ar[j]<ar[min])
				{
					min=j;
				}
			}
			
			if(min!=i)
			{
				temp=ar[i];
				ar[i]=ar[min];
				ar[min]=temp;
			
			}
		}
		
		//selection sort end session
		
		System.out.println("Sorted Array is");
		for(int k=0;k<l;k++)
		{
			System.out.println(ar[k]);
			
		}
		
	

}
}
