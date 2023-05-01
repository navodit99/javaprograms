package sem1;

import java.util.Scanner;
class roadtax
{
    public static void main (String[] args)
    {
        int rdtax;
        System.out.println( "enter road tax ");
        Scanner obj = new Scanner(System.in);
        rdtax = obj.nextInt();
        if (rdtax == 11000)
        {
            System.out.println(" your car is normal");
        }
        else if (rdtax== 20000)
        {
            System.out.println("your car is sedan ");
        }
        else if (rdtax == 30000)
        {
            System.out.println("your car is premium range");
        }
        else if (rdtax == 50000)
        {
            System.out.println(" your car is luxury ");
        }
    }
}