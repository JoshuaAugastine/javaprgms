package Assesment1;

public class Operator2 {

	public static void main(String[] args) {
		double a=15;
		double b=4;
		double result=1;
		char operator='/';
	
		switch(operator) {
			case'+':
				result=a+b;
				break;
			case'-':
				result=a-b;
				break;
			case'*':
				result=a*b;
				break;
			case'/':
				result=a/b;
				break;
			default:
				System.out.println("operator is not correct");
		}
		
		System.out.printf("%.2f" , result);	
}
	}


