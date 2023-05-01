// 1.Write a program to print the student details:  Name, class, Roll no
package sem1;
import java.util.Scanner;
public class Student {
	static String name;
	static int cl;
	static int rollno;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rollno.");
		rollno=sc.nextInt();
		System.out.println("enter class ");
		cl=sc.nextInt();
		System.out.println("name");
		name=sc.next();
		System.out.println("roll no. "+rollno);
		System.out.println("class "+cl);
		System.out.println("name "+name);
		
		sc.close();
		
	}

}
