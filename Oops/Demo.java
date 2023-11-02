package Oops;

// abstract class
abstract class Sum{
 public abstract int sumOfTwo(int n1,int n2);
 public abstract int sumOfThree(int n1,int n2,int n3);
 // regular method
 public void disp() {
	 System.out.println("method of class sum");
 }
 }
// regular class extends abstact class
class Demo extends Sum {
	public int sumOFTwo(int num1,int num2) {
		return num1+num2;
	}
	public int sumOfThree (int num1,int num2 , int num3) {
		return num1+num2+num3;
	}

	public static void main(String[] args) {
        Sum obj = new Demo();
		System.out.println(obj.sumOfTwo(3,7));
		System.out.println(obj.sumOfThree(3,7,6));
		obj.disp();

	}
	@Override
	public int sumOfTwo(int n1, int n2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
