
public class Test5 {
	
	
	static int addnum=0;
	static void even(int n) {
		System.out.print(n+ " ");
	}
	static void fact1(int num) {
		int fact=1;
		if(num==0)
			fact=1;
		else {
	for(int i=num; i>0;i--) {
		fact=fact*i;
	}
		}
	System.out.print(fact+" ");
	}

	public static void main(String[] args) {
		for(int j=0;j<=12;j++) {
			if(j%2==0) {
				even(j);
			
			}
			else
				{
			fact1(addnum);
			addnum++;
				}
			

	}
	}
}

