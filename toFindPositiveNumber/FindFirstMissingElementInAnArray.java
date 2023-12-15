package toFindPositiveNumber;

import java.util.Arrays;

public class FindFirstMissingElementInAnArray {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,7,6,8};
		int a = arr.length;
		Arrays.sort(arr);
			for(int i=0; i<a;i++)
		{
			if((i)!=arr[i])
			{
				System.out.println("The missing number is " +arr[i]);
			
			break;
			}
		}

	}
}



