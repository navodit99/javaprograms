// 5. Create two classes DF & DM distance in Cm & m. 
//    Implement the Concept to read the dimensions in one of these metrics & convert them to other 
//    & display the same.
package sem1;
import java.util.Scanner;
class DM {
	float cm;
	float m;
	void converttom()
	{
         System.out.println("enter the value in centimeter");
         Scanner sc= new Scanner(System.in);
         cm=sc.nextFloat();          
          m=cm*0.01f;
	}
	void display()
	{
		System.out.println("your value in meter is "+m);
	}
}
class DF {
	float m;
	float cm;
	void convertocm()
	{
            Scanner sc = new Scanner(System.in);
                System.out.println("enter value in meter");
                m=sc.nextFloat();
                cm=m*100;
            }
	
	void display()
	{
		System.out.println("your value in centimeter is "+cm);
	}

	
 }


public class Convert {
    /**
     * @param args the command line arguments
     */
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
                DF df=new DF();
		df.convertocm();
		df.display();
               
                DM dm=new DM();
		dm.converttom();
		dm.display();
               
    }
    
}
