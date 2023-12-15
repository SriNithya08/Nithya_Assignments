package toFindPositiveNumber;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 6;
		boolean flag=false;
		for(int i=2; i<=n/2;i++) // 3 T 4
		{
			if(n%i==0)
			{
				System.out.println("The number " + n + " is  prime number");
				flag=true;
				break;
			}
			
			if(flag=true)
			{
				System.out.println("The number " + n + " is not a prime number");
			}
					}
	}

}
