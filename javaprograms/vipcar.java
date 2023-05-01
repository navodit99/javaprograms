package sem1;
import java.util.*;
public class vipcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int vip=0;
         int nonvip = 0;;
         int tax;
         int i;
         int car = 0;
         int noofcar;
         Scanner sc=new Scanner(System.in);
           System.out.println("enter no. of cars passse");
           noofcar=sc.nextInt();
       for(i=0;i<noofcar;i++)
    	   {
    	   System.out.println("press 1 to pay toll and 2 to pass without toll ");
        	 car=sc.nextInt();
        	 
         switch(car){
         case 1:
         System.out.println("tax paid,  now you can pass "); // this line runs a case
         nonvip++;
         break;
         case 2: 
         System.out.println(" VIP car,  you can pass "); // this line runs a case
         vip++;
         break;
     }
         }
     tax=nonvip*50;
 System.out.println(" tax paid by no of cars "+ nonvip+ " "+" \n tax not paid by no of cars "+" " + vip);
 System.out.println("total tax paid"+" "+tax);
 
         
         
	}

}
