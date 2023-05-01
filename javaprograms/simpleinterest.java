package sem1;
import java.util.*;
public class simpleinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       float p,r,t,SI=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter principle amount: ");
       p=sc.nextFloat();
       System.out.println("enter rate of interest: ");
       r=sc.nextFloat();
       System.out.println("enter time: ");
       t=sc.nextFloat();
       SI=(p*r*t)/100;
       System.out.println("Simple Interest is: "+SI);
	}

}
