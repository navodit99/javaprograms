package sem1;

public class numberformatexcept {

	 try {
		 String s="abc";
		 int i=Integer.parseInt(s);
	 }
	 catch(NumberFormatException e)
	 {
		 System.out.println(e);
		 
	 }
	 finally {
		 System.out.println("finally block");
	 }
}
}
