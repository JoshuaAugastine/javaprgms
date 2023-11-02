package Oops;

public class ConstructorOverloading {
	int emp_id ;
	String emp_name;
	String email_id;
 ConstructorOverloading( int id , String name){
   emp_id = id;
   emp_name = name;
 }
 ConstructorOverloading( int id , String name , String email){
	 emp_id = id ;
	 emp_name = name ;
	 email_id = email;
 }
 void display() {
	 System.out.println(emp_id + " " + emp_name + " "+ email_id);
 }
	public static void main(String[] args) {
		ConstructorOverloading c1 = new ConstructorOverloading(111,"joshua");
		ConstructorOverloading c2 = new ConstructorOverloading(112,"jenish","jb@gmail.com0");
		
		c1.display();
		c2.display();

	}

}
