
public class Constructor1 {
	int id;
	String name;
	// creating a parameterized constructor
	 Constructor1(int i,String n){
		 id = i;
		 name = n;
		  }
    // method to display the values
	 void display() {
		 System.out.println(id + " "+ name);
	 }
	public static void main(String[] args) {
		//creating object and passing the values 
		Constructor1 c1 = new Constructor1(111, "joshua");
		Constructor1 c2 = new Constructor1(112, "jenish");
       //calling method to display the value of object
		/*c1.display();
		c2.display();*/
	}

}
