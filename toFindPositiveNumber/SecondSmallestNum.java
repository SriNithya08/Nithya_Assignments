package toFindPositiveNumber;

import java.util.Arrays;

public class SecondSmallestNum {

	public static void main(String[] args) {
		int arr[]={23,45,67,32,89,22};
		Arrays.sort(arr);
		int x=arr.length;
				System.out.println("The second smallest number:" +arr[x-2]);
	}
}




