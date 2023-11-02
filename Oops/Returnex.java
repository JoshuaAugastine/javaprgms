package Oops;

public class Returnex {
	int result;
 void add(int num1 , int num2)	{
	 result = num1+ num2;
	 System.out.println("add : "+ result);
 }
 int sub ( int num1 , int num2) {
	 result = num1-num2;
	 return result;
 }
	public static void main(String[] args) {
		
		Returnex r = new Returnex();
		r.add(89,98);
		System.out.println( "sub :" + r.sub(100, 450));
		

	}

}
