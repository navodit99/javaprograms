package sem1;

public class push {
	int top;
	void push(int data) {
		   if(!isFull()) {
		    top = top + 1;   
		      int[] stack = ;
			stack[top] = data;
		   } else {
		      System.out.println("Could not insert data, Stack is full.\n");
		   }
		}

	private boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}
public static void main(String args[])
{
	push p=new push();
	p.push(2);
}
}
