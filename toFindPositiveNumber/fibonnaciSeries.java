package toFindPositiveNumber;
public class fibonnaciSeries {
	public static void main(String[] args) {
		int a=0;
		int b=1; 
		int sum;
		int range=8;
		System.out.println(a);
		System.out.println(b);
			for(int i=2;i<=range;i++)
		{
			sum=a+b; //
			a=b; 
			b=sum; 
			System.out.println(sum);

		}
System.out.println("Thank You");
	}
}






