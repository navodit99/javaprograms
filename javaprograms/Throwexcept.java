package sem1;

public class Throwexcept {

		// TODO Auto-generated method stub
		public static void validate(int age)
		{
			if(age<18)
			{
				throw new ArithmeticException("not eligible for vote");
			}
			else {
				System.out.println("welcome to vote");
			}
		}

	public static void main(String[] args) {
		validate(10);
	}

}

