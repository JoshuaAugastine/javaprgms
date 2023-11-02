
import java.util.Scanner;
 
class Rectangle{
	int length;
	int width;
	int result;
void insert(int l, int w)	{
	length=l;
	width=w;
}
int calculateArea1() {
	   result = length*width;
	   return result;
	   }
}
 public class TestRect1 {

	public static void main(String[] args) {
		int a []= new int[5];
		int b []= new int[5];
		Scanner s = new Scanner(System.in);
		Rectangle r1 = new Rectangle();
		for(int i=1; i<5 ;i++) {
	System.out.println("enter the length and width : ");
	   a[i]=s.nextInt();
	   b[i]=s.nextInt();
		}
  for(int i=0; i<5;i++) {
	  r1.insert(a[i],b[i]);
	  System.out.println("area of rect :");
	  System.out.println(r1.calculateArea1());
  }  
  }
}
