package opertors;

public class Increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=40,b=78;
		int result1,result2;
		//original value
		System.out.println("value of a:"+a);
		//increment operator
		//after increment a++
		result1 = a++;
		System.out.println("after increment :"+ result1);
		System.out.println("value of b:"+b);
         //decrement operator
		result2= --b;
		System.out.println("after decrement:"+result2);
	}

}
