package Oops;

class person{
	public void role() {
		System.out.println("son/daughter");
		
	}
}
public class Overriding extends person {
	public void role() {
		super.role();
		System.out.println("student");
	}

	public static void main(String[] args) {
		Overriding or = new Overriding();
		or.role();
		// TODO Auto-generated method stub

	}

}
