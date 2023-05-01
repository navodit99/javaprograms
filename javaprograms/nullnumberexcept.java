package sem1;
public class nullnumberexcept {
public static void main (String args[]) {
    try {
        String s=null;
        System.out.print(s.length());
    }
    catch(NullPointerException n) {
        System.out.println(n);

    }
    finally {
        System.out.println("kunal gandu");
    }
    try {
        String s="1";
        int i=Integer.parseInt(s);
    }
    catch(NumberFormatException f) {
        System.out.println(f);
    }
    finally {
        System.out.println("kunal ki mkc");
    }
}
}
