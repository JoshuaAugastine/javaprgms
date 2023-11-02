package Oops;
class EncapsulationDemo{
	private int ssn;
	private String empName;
	private int empAge;
	
	// getter n setter medhod is using to print hidden datas
	public int getEmpSSN() {
		return ssn;
	}
	public String getEmpName() {
		return empName;
	}
	
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpName(String newValue) {
		empName = newValue;
	}
	public void setEmpSSN(int newValue) {
		ssn = newValue;
	}
	public void setEmpAge(int newValue) {
		empAge = newValue;
	}
}
public class EncapsTest {

	public static void main(String[] args) {
		EncapsulationDemo obj = new EncapsulationDemo();
		obj.setEmpName("jo");
		obj.setEmpAge("22");
		obj.setEmpSSN(111);
		System.out.println("Employee name :" + obj.getEmpName());
		System.out.println("Employee ssn :" + obj.getEmpSSN());
		System.out.println("Employee age :" + obj.getEmpAge());
		

	}

}
