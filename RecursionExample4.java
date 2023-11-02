
public class RecursionExample4 {
	static int n1=0,n2=1,n3=0;
	static void printfibo(int count) {
		if(count>0) {
			n3= n1+n2;
			n1 = n2;
			n2 = n3;
			System.out.println("" + n3);
			printfibo(count-1);
			
		}
	}

	public static void main(String[] args) {
		int count =15;
		System.out.println(n1+""+n2); //printing 0 n 1
		printfibo(count-2);//n-2 bcoz 2 numbers are already printed
		// TODO Auto-generated method stub

	}

}
