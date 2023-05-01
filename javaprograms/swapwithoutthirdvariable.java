package sem1;
import java.util.*;
public class swapwithoutthirdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int a,b;
           System.out.println("enter two numbers: ");
           Scanner sc=new Scanner(System.in);
           a=sc.nextInt();
           b=sc.nextInt();
           System.out.println("before swapping numbers are: "+a+" "+b);
           a=a+b;
           b=a-b;
           a=a-b;
           System.out.println("after swapping numbers are: "+a+" "+b);

	}
	

}
