package array;

public class bubble {

	public static void main(String[] args) {

		int[] ar = { 14, 17, 54, 12, 3, 8, 90 };

		int n = ar.length;

		int temp;

		for (int i = 0; i < n - 1; i++)

		{
			for (int j = 0; j < n - 1; j++)

			{
				if (ar[j] > ar[j + 1]) {

					temp = ar[j];

					ar[j] = ar[j + 1];

					ar[j + 1] = temp;

				}

			}

		}

		System.out.println("Sorted Array is");

		for (int k = 0; k < n; k++)

		{

			System.out.println(ar[k]);

		}

		// TODO Auto-generated method stub




}





}

