package Oops;

class Staticex {
	int count=0;   // without static    -   like int count =0 ;
	                         // the output will be 1 1 1 - it doesnt hold the previous value
	                  // using static that shows 1 2 3 - it hold the previous value n add another
	Staticex(){
		count++;
		System.out.println(count);
	}
	
 

	public static void main(String[] args) {
		Staticex s1 = new Staticex();
		Staticex s2 = new Staticex();
		Staticex s3 = new Staticex();
		

	}

}
