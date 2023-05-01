package sem1;
class Person {
	public String name;
	public String address;
	void getdata(String n,String a)
	{
		name=n;
		address=a;
	}
}
class Stud extends Person
{
	public int rollno;
	public String course;
	void getdetail(int r, String c)
	{
		rollno=r;
		course=c;
	
	}
	void putdetail()
	{
		System.out.println("name "+name);
		System.out.println("Add "+address);
		System.out.println("rollno "+rollno);
		System.out.println("course "+course);
	}
}

class personstudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Stud s=new Stud();
           s.getdata("navodit", "delhi");
           s.getdetail(1, "MCA");
           s.putdetail();
	}

}
