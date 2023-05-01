package sem1;
class person
{
	public String name;
	public String address;
	public String rollno;
	public int id;

	void getdata(String n,String a)
	{
		name=n;
		address=a;
	
	}
}
class stud extends person
{

	void getdetail(String r, int id)
	{
		rollno=r;
		this.id=id;
	}
}
class representative extends person
{
	public String representative;
	void getdetail2(String rep)
	{
		representative=rep;
	}
	void putdetails()
	{
		System.out.println("name "+name);
		System.out.println("add "+address);
		System.out.println("rollno "+rollno);
		System.out.println("ID "+id);
		System.out.println("representative type: "+representative);
	}
}

public class personinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		representative r=new representative();
		r.getdata("navodit", "delhi");
		r.getdetail2("CR");

	}

}
