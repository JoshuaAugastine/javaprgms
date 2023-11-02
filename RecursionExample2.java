
public class RecursionExample2 {
    //static variable- holds the last value of the loop
	static int count=0;
	static void p() {
		count++;
		if(count<=3) {
			System.out.println("joshua augastine");
			p();
			
		}
	}
	public static void main(String[] args) {
		p();

	}

}
