package Assesment1;


public class Shinhan {
	int value,result;
	 void Method( int a,int b,int s) {
		value=a-b;
		System.out.println("Value : "+value);
		result=value/s;
		System.out.println("Result is "+result);
	}
	 

	public static void main(String[] args) {
		Shinhan s=new Shinhan();
		s.Method(5,2,3);
		s.Method(9,1,2);
	
	

	}

}
