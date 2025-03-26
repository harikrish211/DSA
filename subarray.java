package dsa;

public class subarray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int i,j,k;
		int l=a.length;
		int sum;
		int max=0;
		int count=0;
		for(i=0;i<l;i++)
		{
			
			for(j=i;j<l;j++)
			{
				sum=0;
				for(k=i;k<j;k++)
				{
					
					System.out.print(a[k]);
					sum=sum+a[k];
					
					
				}
				if(sum>max)
				{
					max=sum;
					count++;
				}
				System.out.println("");
			}
		}
		
		System.out.println("Maximum sub array :"+max);
		
		System.out.println("in the "+count+"position");
		
		
		

	}

}
