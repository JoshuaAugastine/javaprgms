package Oops;

public class Objectex {
	   int id;
	   String name ;
	   // constructor to intialize int and string
	   Objectex(int i , String n){
		   id = i ;
		   name = n;
		  }
	   // constructor to intialize another object
	   // when the object sender will be a object , receiver also need to be a object
	   Objectex(Objectex o){
		   id = o.id;
		   name = o.name;
   }
	   void display() {
		   System.out.println(id + " "+ name);
	   }
	public static void main(String[] args) {
		Objectex o1 = new Objectex(987,"joshua");
		Objectex o2 = new Objectex(o1);
		 o1.display();
		 o2.display();

	}

}
