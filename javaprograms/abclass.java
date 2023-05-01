package sem1;
abstract class shape
{
	abstract void draw();  
	void display()
	{
		System.out.println("abstract class");
	}
}
class Rectangle extends shape
{
	void draw()
	{
		System.out.println("Draw Rectangle");
	}
	void show()
	{
		System.out.println("Rectangle class");
	}
	
}
class Circle extends shape
{
	
}
class abclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Rectangle r=new Rectangle();
      r.display();
      r.draw();
      r.show();
	}

}
