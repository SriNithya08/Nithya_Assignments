package toFindPositiveNumber;

public class Palindrome {

	public static void main(String[] args) {
		int num1 = 123;
		int num2;
		num2 = num1;
		int i;
			for(i=0;num1>0;num1=num1/10)
			{
				int n=num1%10;
				i=(i*10)+n;
			}
		if(i==num2)
		{
			System.out.println(num2 + " is palindrome");
		}
		else
		{
			System.out.println(num2 + " is not palindrome");
		}
		

	}

}
