package sem1;

public class city {
	String name;
	float pop;
	void display(String n,float pop) {
		name=n;
		this.pop=pop;
		System.out.println("city name: "+name);
		System.out.println("population: "+pop);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         city c1=new city();
         city c2=new city();
         c1.display("delhi", 20000);
         c2.display("mumbai", 20000000);
	}

}
