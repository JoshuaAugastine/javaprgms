package Assesment2;

public class Construct {
	double width,height,depth;
	
 Construct(){
 }
 Construct( double wid , double heig, double dep){
	 width = wid ;
	 height = heig ;
	 depth = dep;
 }
 void volume() {
	 System.out.println( " volume: " + width*height*depth);
 }
	public static void main(String[] args) {
		Construct c1 = new Construct();
		Construct c2 = new Construct(36,24,48);
		
		c1.volume();
		c2.volume();
		

	}

}
