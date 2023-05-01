package sem1;
import java.util.*;
public class factorial {
	double n,fact=1;
	void factorial()
	{
		
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
	}
	void display()
	{
		System.out.println("factorial of the number is "+fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      factorial f=new factorial();
      f.factorial();
      f.display();
	}

}
