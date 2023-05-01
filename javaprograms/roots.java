package sem1;
import java.util.*;
public class roots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          double a,b,c,firstroot=0; double secondroot = 0;
		double Determinant=0.0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of a: ");
		a=sc.nextDouble();
		System.out.println("enter value of b: ");
		b=sc.nextDouble();
		System.out.println("enter value of c: ");
		c=sc.nextDouble();
		Determinant=b*b - 4*a*c;
		double sqrt=Math.sqrt(Determinant);
		if(Determinant>0)
		{
			firstroot=(-b+sqrt)/(2*a);
			secondroot=(-b-sqrt)/(2*a);
			System.out.println("roots are: "+firstroot+" "+secondroot);
		}
		else if(Determinant==0) {
			firstroot=secondroot=-b/(2*a);
			System.out.println("roots are: "+firstroot);
		}
		else {
			 double real = -b / (2 * a);
		      double imaginary = - sqrt / (2 * a);
		      System.out.format("root1 = %.2f+%.2fi", real, imaginary);
		      System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
		}
	}

}
