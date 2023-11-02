package Oops;

class marks{
	int stud_id;
	String stud_name;
	void getInfo(int id ,String name) {
	stud_id=id;
	stud_name=name;
	
	}
	
	void putInfo() {
		System.out.println("student Id    :" +stud_id);
		System.out.println("student name  :" +stud_name);
	}
}
	class stud extends marks{
	int m1,m2,m3;
	int tot,avg;
	 
	void getInfo1(int mark1, int mark2, int mark3) {
		getInfo(101,"jo");
		mark1 = m1;
		mark2 = m2;
		mark3 = m3;
		tot = mark1+mark2+mark3;
		avg = tot/3;
		
	}
	void putinfo1() {
		putInfo();
		System.out.println("m1    : " + m1);
		System.out.println("m2    : " + m2);
		System.out.println("m1    : " + m3);
		System.out.println("total : " + tot);
		System.out.println("avg   : " + avg);
	}
		
	public class Inherit2 {
	public static void main(String[] args) {
		 d = new jk();
		d.getInfo1(90,95,56);
		d.putInfo();
		// TODO Auto-generated method stub

	}
	}
	 }
