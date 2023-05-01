package sem1;

public class Nullexcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	String s=null;
	System.out.println(s.length());
	
}
catch(NullPointerException e)
{
	System.out.println(e);
}
finally {
	System.out.println("finaly block");
}
}
}