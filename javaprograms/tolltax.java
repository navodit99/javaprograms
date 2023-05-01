package sem1;
import java.util.*;

class tolltax{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int i =0; 
        int tax_paying= 0;
        int non_tax_paying=0;
        int car = 0;
        while(i< 5 ){
        i++;
            System.out.println("press 1 to pay toll and 2 to pass without toll ");
             car = sc.nextInt();

        switch(car){
            case 1:
            System.out.println("tax paid,  now you can pass "); // this line runs a case
            tax_paying=tax_paying+1;
            break;
            case 2: 
            System.out.println(" VIP car,  you can pass "); // this line runs a case
            non_tax_paying= non_tax_paying+1;
            break;
        }}
        int tax  = tax_paying*50;
    System.out.println(" tax paid by no of cars "+ tax_paying+ " "+" \n tax not paid by no of cars "+" " +non_tax_paying  );
    System.out.println("total tax paid"+" "+tax);
    
    }
}