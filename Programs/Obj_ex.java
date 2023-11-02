package Programs;

public class Obj_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello World";
		String anotherString = "HELLO WORLD";
		Object objStr=str;
		
		 System.out.println(str.compareTo(anotherString));
		 System.out.println(str.compareToIgnoreCase(anotherString));
		 System.out.println(str.compareTo(objStr.toString()));
		 
		 //OBJECT - NO NEED TO SPECIFY DATATYPE
		 //...........................
		 //heap memory / normal memory
		 String s1= "joshua";
		 String s2= "joshua";
		 String s3= new String ("joshua");
		 System.out.println(s1.equals(s2));
		 System.out.println(s2.equals(s3));
		 System.out.println(s1 == s2);
		 System.out.println(s2 == s3);
		 
		 //................
		 
		 
		 String x = "Hello world , hello java , Hello";
		 int lastIndex = x.lastIndexOf("hello");
		 if(lastIndex == -1) {
			 System.out.println("hello not found");
		 }
		 else
		 {
			 System.out.println("last occurence of hello is at index  " + lastIndex);
			 
		 }

	}
}
