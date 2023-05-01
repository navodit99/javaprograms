package sem1;
import java.util.*;
public class Sumandreverse {
	public static void main(String args[]) {
	int n,reverse=0,remainder,sum=0;
	System.out.println("enter a three digit number: ");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	while(n>0) {
	remainder=n%10;
	reverse=reverse*10+ remainder;
	sum=sum+remainder;
	n=n/10;
	}
	System.out.println("sum of three digit number is: "+sum);
	System.out.println("reverse of three digit number is: "+reverse);
}

}
