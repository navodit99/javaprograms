package sem1;
import java.util.*;
public class largenum {
	    public static void main(String[] args) {
	        Scanner obj = new Scanner(System.in);
	        int[] arrr = new int[5];
	        System.out.println("Enter the elements of array: ");
	        int highest=arrr[0];
	        int sechighest=arrr[0];
	        for(int i = 0;i<5;i++){
	            arrr[i] = obj.nextInt();
	            
	            if(arrr[i]>highest){
	                sechighest = highest;
	                highest=arrr[i];
	            }
	            else if(arrr[i]>sechighest){
	                sechighest = arrr[i];
	            }
	        }
	        System.out.println("Highest Number is "+ highest);
	        System.out.println("Second highest number is "+ sechighest);
	    }
	}