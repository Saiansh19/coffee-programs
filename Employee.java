class Employee
{
	String name;
	int empid;
	
	Employee(String name, int empid)
	{
		this.name=name;
		this.empid=empid;
	}
	Employee()
	{
		this("Anil", 500);
	}
	void display()
	{
		System.out.println("Employee ID:"+ empid);
		System.out.println("Name:"+ name);
	}
}

class ThisExam
{
	public static void main(String[] args)
	{
		Employee emp1=new Employee();
		emp1.display();
		
		Employee emp2=new Employee("Ravi", 101);
		emp2.display();
	}
}