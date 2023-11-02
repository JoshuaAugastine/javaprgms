package Oops;

class about{
	void show() {
		System.out.println(" Hellow , Its a syl's cafe, welcome everyone");
	}
}
class product extends about{
	void show1() {
		System.out.println(" We have multiple types of tea's and coffee");
		System.out.println(" *Tea    - dham/green/masala/black ");
		System.out.println(" *Coffee - cappuccino/latte/espresso");
		}
}
class contactus extends product{
	void show2() {
		System.out.println("EmailID : sylscafe@1gmail.com");
	}
}
public class inheritex2 extends contactus {

	public static void main(String[] args) {
		inheritex2 i1 = new inheritex2();
		i1.show();
		i1.show1();
		i1.show2();
	}

}
