// 4. Create a class Rectangle having data member : length and breath and method :area and perimeter. 
//     Test the functionality of a program.
package sem1;
import java.util.Scanner;
public class rectangleap {
       float length;
       float breadth;
       float a;
       float p;
       void area()
       {
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("enter length");
    	   length=sc.nextInt();
    	   System.out.println("enter breadth");
    	   breadth=sc.nextInt();
    	   a=length*breadth;
    	   
    	   sc.close();
       }
       void perimeter()
       {
    	   
    	    p=2*(length+breadth);
    	   
    	   
       }
       void Display()
       {
    	   System.out.println("area of rectangle is "+a);
    	   System.out.println("perimeter of rectangle is "+p);
       }
       public static void main(String[] args)
       {
    	   rectangleap r=new rectangleap();
    	   r.area();
    	   r.perimeter();
    	   r.Display();
       }
}
