package sem1;
import java.util.*;
public class checkdivisible {
	static boolean prime(int n)
	{
	if(n%3==0&&n%5==0)
	{
		return true;
	}
	else
	{
		return false;
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		System.out.println("enter the number till you want to find");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		for(int i=0;i<=number;i++)
		{
			if(prime(i))
			{
				System.out.println(i);
				
				
			}
			else
				System.out.println("not divisible "+i);
		}
		
	

}
}