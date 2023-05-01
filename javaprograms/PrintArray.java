package sem1;

import java.util.Scanner;

public class PrintArray {
	int a[]=new int[15];
	int i,n;
	void Arr()
	{
		
		System.out.println("enter size of array");
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("enter array elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
	}
void Display()
{
	for(i=0;i<n;i++)
	{
	System.out.println("array elements: "+a[i]);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
PrintArray pr=new PrintArray();
pr.Arr();
pr.Display();
	}

}
