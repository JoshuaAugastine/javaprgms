package Oops;

interface Myinterface
{
	/* compiler will treat them as 
	public abstract void method1();
	public abstract void method2();*/
	public void method1();
	public void method2();
	
}
class Demo2 implements Myinterface  {
	public void method1() {
		System.out.println("implementation of method 1 :" );
	}
	public void method2() {
		System.out.println("implementation of method 2 :");
	}

	public static void main(String[] args) {
     Myinterface obj = new Demo2();
     obj.method1();
     obj.method2();
     
	}

}
