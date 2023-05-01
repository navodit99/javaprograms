package sem1;
interface Bank{  
float rateOfInterest();  
}  
class SBI implements Bank
{  
public float rateOfInterest(){
	return 9.15f;
	}  
}  
class PNB implements Bank{  
public float rateOfInterest() {
	return 9.7f;
	}  
}  
class bankinterface{  
public static void main(String[] args){  
Bank b=new SBI();  
Bank c=new PNB();
System.out.println("ROI: "+c.rateOfInterest());  
System.out.println("ROI: "+b.rateOfInterest());  
}} 