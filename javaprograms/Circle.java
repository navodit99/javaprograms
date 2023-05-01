// 3. Create a class circle having data member : radius and method :area.Test the functionality of a program.
package sem1;
import java.util.Scanner;
public class Circle {
         float radius;
         float a;
         float pie=3.14f;
         void Area()
         {
        	 Scanner sc=new Scanner(System.in);
        	 System.out.println("enter radius");
        	 radius=sc.nextInt();
        	 a=pie*radius*radius;
        	 sc.close();
        	 
         }
         void displayarea()
         {
        	 System.out.println("area of circle is "+a);
         }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		c.Area();
		c.displayarea();

	}

}
