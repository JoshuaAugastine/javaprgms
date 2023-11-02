package Assignments;

//import Oops.ConstructorOverloading;

public class Constex {
	int pro_id ;
	String pro_name;
	float  price;
 Constex( int id , String name){
   pro_id = id;
   pro_name = name;
 }
 Constex( int id , String name , float prz){
	 pro_id = id ;
	 pro_name = name ;
	 price = prz;
 }
 void display() {
	 System.out.println("product id : "+ pro_id + "  "+ "product name :" + pro_name + "   " +" price "+ price);
 } 
	public static void main(String[] args) {
		Constex c1 = new Constex(876,"t-shirt");
		Constex c2 = new Constex(543,"jeans",999);
		
		c1.display();
		c2.display();
		

	}

}
