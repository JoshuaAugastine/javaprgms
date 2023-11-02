package Oops;

class Base {
	int emp_id=101;
	String emp_name="jo";
	void getInfo(int id ,String name) {
	emp_id=id;
	emp_name=name;
	
	}
	
	void putInfo() {
		System.out.println("Employee Id" +emp_id);
		System.out.println("Employee name" +emp_name);
	}
}
	
    class Derived extends Base{
	String designation;
	int salary;
	void getInfo1(String desig, int sal) {
		getInfo(101,"jo");
		designation = desig;
		salary =sal;
		
	}
	void putinfo1() {
		putInfo();
		System.out.println("designation" + designation);
		System.out.println("salary" + salary);
	}
	}
    public class Inheritance{
	public static void main(String[] args) {
		Derived d = new Derived();
		d.getInfo1("HR",20000);
		d.putInfo();
		
	}
}
    
    
    




