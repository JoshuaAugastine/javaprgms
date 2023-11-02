package Programs;

public class Reverse_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "abcdef";
   	  String reverse = new StringBuffer(s).reverse().toString();
   	  System.out.println("\nString before reverse:" +s);
   	System.out.println("String after reverse:" +reverse);
   	
	  
   	  ///..................
   	
   	
   	String x = "abcdef";
   	char[] try1=x.toCharArray();
   	for(int i = try1.length-1;i>=0;i--)
   		System.out.print(try1[i]);
   	
	}

}
