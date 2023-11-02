package Assesment2;


class Overload{
	void demo (float a)
	{
		System.out.println("area of square:" + a);
	}
	void demo (int b)
	{
		System.out.println("area of rectangle:" + b );
	}
	double demo (double a)
	{
		System.out.println("area of circle:" +a);
		return a*a;
	}
}

public class MethodOver {

	public static void main(String[] args) {
		
		Overload obj = new Overload();
		double result;
		obj.demo(25);
		obj.demo(132);
		result = obj.demo(19.625);
		System.out.println(result);

	}

}
