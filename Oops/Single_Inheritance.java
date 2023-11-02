package Oops;

class Person1{
	String name;
	int age;
	void getPerInfo(String str,int ag) {
		name=str;
		age=ag;
	}
	//base class - getting from user once use anywhere
void putPerInfo() {
	System.out.println("Name:"   + name);
	System.out.println("Age:"   + age);
}
}
// 
class Student23 extends Person1{
	int total;
	char grade;
	void getStuInfo(String n,int ag,int tot,char gr) {
		getPerInfo(n,ag);
		total=tot;
		grade=gr;
	}
void putStuInfo()	{
	putPerInfo();
	System.out.println("Total:"   + total);
	System.out.println("grade:"   + grade);
	
	
}
}

public class Single_Inheritance {

	public static void main(String[] args) {
		Student23 s= new Student23();
		s.getStuInfo("Honey",22,98,'A');
		s.putStuInfo();

	}

}
