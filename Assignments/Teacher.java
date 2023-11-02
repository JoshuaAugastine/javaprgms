package Assignments;

 class Teacher {
	float salary = 25000;
}
  class Englishteacher extends Teacher {
	  int com_skill= 5000;
	public static void main(String[] args) {
	    Englishteacher t = new Englishteacher();
		System.out.println("Teacher salary is           :" + t.salary);
		System.out.println("salary of Englishteacher is :" +( t.com_skill+ t.salary));
}

	}

