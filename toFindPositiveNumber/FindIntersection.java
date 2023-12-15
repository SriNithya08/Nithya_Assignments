package toFindPositiveNumber;

public class FindIntersection {

	public static void main(String[] args) {
		int a[] = {3,2,11,4,6,7};
		int b[] = {1,8,2,4,9,7};
		int x = a.length;
		int y = b.length;
	
		for (int i = 0; i<x;i++)
{
	for (int j = 0; j<y;j++)
	{
		if(a[i]==b[j])
		{
			System.out.println(a[i] + " is equal to " + b[j]);
		}
	}	continue;
}
	
	}

}
