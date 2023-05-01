package sem1;
import java.util.Scanner;
public class ageexcept {
    void age(int a) {
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if (a<18) {
            try {
                System.out.println("arithematic exception");
            }
            catch(ArithmeticException e) {
                System.out.println(e);
            }
        }
        else {
            System.out.println("welcome on board");
        }
    }
    public static void main(String args[]) {
        ageexcept ae=new ageexcept();
         
        ae.age(18);
    }
    
    
}
