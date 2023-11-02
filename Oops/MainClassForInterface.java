package Oops;

interface Base1{
	public void fun1();
	}
interface Base2{
	public void fun2();
	}

class Intermul implements Base1,Base2{
	public void fun2() {
		System.out.println("fun2");
	}
	public void fun1() {
		System.out.println("fun1");
	}
	
}
public class MainClassForInterface {

	public static void main(String[] args) {
		Intermul obj = new Intermul();
		obj.fun1();
		obj.fun2();
	}

}
