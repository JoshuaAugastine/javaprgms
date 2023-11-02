package Oops;
 class jo{
	 int rollno;
	 String name;
	 float fee;
	 jo(int rollno, String name,float fee ){
		this.rollno=rollno;
		 this.name=name;
		 this.fee=fee;
		 
	 }
	 void display() {
		 System.out.println(rollno+ " " + name +" " + fee);
	 }
 }

public class TestThis1 {

	public static void main(String[] args) {

		jo s1 = new jo(111,"jo",50000f);
		jo s2 = new jo(112,"jb",60000f);
		s1.display();
		s2.display();
		// TODO Auto-generated method stub

	}

}
