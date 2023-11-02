package Oops;

class person1{
	void show() {
	System.out.println("person class");
}
}
class student extends person1{
	void show1() {
	System.out.println("student class");
	}
}
class engineeringstudent extends student {
	void show2() {
	System.out.println("Engineering student class");
	}
}
public class Inheritanceex1 extends engineeringstudent{


	public static void main(String[] args) {
		 Inheritanceex1 e1 = new Inheritanceex1();
		
		 e1.show();
		 e1.show1();
		 e1.show2();
		
}
	}


