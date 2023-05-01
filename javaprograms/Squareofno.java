// 2. Write a program to find the square of a number.
package sem1;
import java.util.Scanner;
public class Squareofno {
	static int i;
	static int square=0;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		i=sc.nextInt();
		square=i*i;
		System.out.println("square of the number is "+square);
		sc.close();
	}

}
