package toFindPositiveNumber;

public class convertToPostiveNum {
	public static void main(String[] args) {
		int n=-34;
		if(n<=0)
		{
			int num=Math.abs(n);
			System.out.println("The Number " + n + " is coverted to " + num);
		}
		else
		{
			System.out.println("The Number is positive");
		}
	}
}
