package sem1;

public class Arrayindexoutofbound {
	public static void main(String args[]) {
	
	try {
	
	int arr[]=new int[5];
	 arr[10]=20;
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
		
	}
	finally {
		System.out.println("finally block");
	}
}

}
