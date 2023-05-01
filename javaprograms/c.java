package sem1;
class A{  
void msg(){System.out.println("Hello");}  
}  
class B{  
void msg(){System.out.println("Welcome");}  
}  
class c extends A,B{//suppose if it were  
	public class c{
   
 public static void main(String args[]){  
   c obj=new c();  
   obj.msg();//Now which msg() method would be invoked?  
}  
} 
