package Oops;

// abstract class
abstract class Sum1{
 public abstract int sumOfTwo(int n1,int n2);
 public abstract int sumOfThree(int n1,int n2,int n3);
 // regular method
 public void disp() {
	 System.out.println("method of class sum");
 }
 }
// regular class extends abstact class
class Demo1 extends Sum1{
	public int sumOfTwo(int num1,int num2) {
		return num1+num2;
	}
	public int sumOfThree (int num1,int num2 , int num3) {
		return num1+num2+num3;
	}

	public static void main(String[] args) {
		Sum1 obj = new Demo1();
		System.out.println(obj.sumOfTwo(3,7));
		System.out.println(obj.sumOfThree(3,7,6));
		obj.disp();

	}

}
