
public class Operation {
	int data=50;
	
	void change(int data) {
		this.data=data+100; // changes will be in the local variable only
		// if the parameter name is same , use this.data - this keyword
	}

	public static void main(String[] args) {
		Operation op = new Operation(); 
		// we didn't update the data ,so its print value as 50
		
		
		System.out.println("before change : "+ op.data);
		op.change(500);
		System.out.println("after change  : "+ op.data);
	}

}
