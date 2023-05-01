package sem1;
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n,reverse=0,remainder,temp;
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a number: ");
         n=sc.nextInt();
         temp=n;
         while(n>0)
         {
        	 remainder=n%10;
        	 reverse=reverse*10+remainder;
        	 n=n/10;
         }
         if(temp==reverse)
         {
        	 System.out.println("number is palindrome");
         }
         else {
        	 System.out.println("number is not palindrome");
         }
	}

}
