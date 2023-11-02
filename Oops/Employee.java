package Oops;
 class Programmer {
	float salary = 40000;
	}
	  class Employee extends Programmer{
		  int bonus = 10000;
		public static void main(String[] args) {
			Employee p = new Employee();
			System.out.println("programmer salary is :" + p.salary);
			System.out.println("bonus of programmer is :" + p.bonus);
}
}
