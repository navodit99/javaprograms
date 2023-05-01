package sem1;
class employee {
	public long empnumber;
	public String empname;
	public String job;
	void showinfo(long en,String n,String j)
	{
		empnumber=en;
		empname=n;
		job=j;
	}
}
class salary extends employee
{
	public double basic;
	public double newsalary;
	void calculate(double b,double percentage)
	{
		basic=b;
		newsalary=0;
		newsalary=basic+(basic*percentage)/100;
	}
	void displaydata()
	{
		System.out.println("employee number: "+empnumber);
		System.out.println("employee name: "+empname);
		System.out.println("Job: "+job);
		System.out.println("basic salary: "+basic);
		System.out.println("new basic salary: "+newsalary);
	}
}
public class emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       salary s=new salary();
       s.showinfo(111, "navodit", "data analyst");
       s.calculate(20000,20);
       s.displaydata();
	}

}
