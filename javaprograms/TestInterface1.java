package sem1;
import java.util.*;
	//Interface declaration: by first user  
	interface Drawable{  
	void draw();  
	}  
	//Implementation: by second user  
	class rectangular implements Drawable{  
	public void draw(){
		System.out.println("drawing rectangle");
		}  
	}  
	class circular implements Drawable{  
	public void draw(){
		System.out.println("drawing circle");
		}  
	}  
	//Using interface: by third user  
	class TestInterface1 {  
	public static void main(String args[]){  
	Drawable d=new circular();//In real scenario, object is provided by method e.g. getDrawable() 
	Drawable e=new rectangular();
	e.draw();
	d.draw();  
	}} 