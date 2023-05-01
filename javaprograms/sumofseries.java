package sem1;
import java.util.*;

public class sumofseries {
     
    // Function to return sum of
    // 1/1 + 1/2 + 1/3 + ..+ 1/n
    static double sum(int n)
    {
      double i, s = 0.0;
      for (i = 1; i <= n; i++)
          s = s + 1/i;
      return s;
    }
  
    
    // Driven Program
    public static void main(String args[])
    {
        int n;
        System.out.println("enter the number till you want to find series: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.printf("Sum is %f", sum(n));
         
    }
}