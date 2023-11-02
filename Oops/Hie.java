package Oops;

class parents{
	 void show(){
		 System.out.println("We are Parents");
	 }
}
class son1 extends parents{
	 void disp(){
		 System.out.println("I am son class ");
	 }
}
class daughter extends parents{
	 void disp(){
		 System.out.println("I am daughter class");
	 }
}
public class Hie {

	public static void main(String[] args) {
		son1 s= new son1();
		daughter d = new daughter();
		s.show();
		d.show();
		s.disp();
		d.disp();

	}

}
