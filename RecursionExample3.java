
public class RecursionExample3 {
	static int fac(int n) {
		if(n==1)
			return 1;
		else
			return (n* fac(n-1));
	}

	public static void main(String[] args) {
		System.out.println("Factorial of 5 is :" + fac(5));

	}

}
/* 5*factorial(5-1)
5* fact(4)
5*4*fac(3)
5*4*3 fac(2)
5*4*3*2fac(1)
5*4*3*2*1*/