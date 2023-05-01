package sem1;
import java.util.*;
public class primenumbers {
	static boolean prime(int n)
	{
	if(n==0||n==1)
	{
		return false;
	}
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			return false;
		}
		
	}
       return true;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		System.out.println("enter the number till you want to find prime numbers");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		for(int i=0;i<=number;i++)
		{
			if(prime(i))
			{
				System.out.println(i);
				
				
			}
			else
				System.out.println("not a prime number: "+i);
		}
		
	

}
}