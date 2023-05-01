package sem1;
import java.util.*;
public class libraryfine {
	public static void main(String args[]) {
	int n;
	float fine;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no. of days the book is returned late");
	n=sc.nextInt();
	if(n<=5)
	{
		System.out.println("no fine");
		
	}
	else if(n>5 && n<=10)
	{
		fine=(n-5)*5;
		System.out.println("fine: "+fine);
	}
	else if(n>10 && n<=30)
	{
		fine=25+(n-10)*10;
		System.out.println("fine: "+fine);
	}
	else if(n>30)
	{
		System.out.println("cancel membership");
		fine=225+(n-30)*15;
		System.out.println("fine: "+fine);
	}
	
	
}

}
