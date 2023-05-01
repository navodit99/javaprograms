package sem1;
import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int temp=0;
        int i;
        int[] arr=new int[5];
        int min=arr[0];
        Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++)
        {
        	System.out.println("enter elements in array: ");
        	arr[i]=sc.nextInt();
        	if(arr[i]<min)
        	{
        		
        		min=arr[i];
        		
        	}
        	
        }
        System.out.println("smallest number: "+min);
	}

}
