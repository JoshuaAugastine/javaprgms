package Oops;
//ex organziation - employee- 1.fulltime 2.parttime 3.intern * hierarchiacal
class person2{
	void show(){
		System.out.println(" person class");
	}
}
class teacher extends person2{
	void show1(){
		System.out.println(" teacher class");
	}
}
class student2 extends person2{
	void show2(){
		System.out.println(" student class");
	}
}
class doctor extends person2{
	void show3(){
		System.out.println(" doctor class");
	}
}
public class multipleinherit extends person2 {

	public static void main(String[] args) {
		person2 p = new person2();
		teacher t = new teacher();
		student2 s = new student2();
		doctor d = new doctor();
		p.show();
		t.show1();
		s.show2();
		d.show3();
		
		

	}

}
