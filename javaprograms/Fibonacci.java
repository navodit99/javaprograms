package sem1;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.print("enter the number till which you want to find fibonacci series: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a=0,b=1,c;
		System.out.println(a+"");
		System.out.println(b+"");
		for(int i=2;i<=n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
