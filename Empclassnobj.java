
class Employee{
	int emp_id;
    String emp_name;
	int salary;
	int bonus;

void insert(int id, String name , int sal , int bon)	{
	emp_id= id;
	emp_name = name;
	salary =  sal;
	bonus =bon;	
	
}
void empdet(){	
	 System.out.print(emp_id+ " ");
}
void empdet1(){	
	 System.out.print(emp_name+ " ");
}
 void Netsalary(){	
	 System.out.print(salary+bonus);
 }
}
public class Empclassnobj {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
				e1.insert(234," jo ", 25000, 2000);

				e1.empdet();
				e1.empdet1();
		        e1.Netsalary();
				
			

	}

}
