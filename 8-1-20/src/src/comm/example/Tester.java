package comm.example;

public class Tester {

	public static void main(String[] args) throws EmployeeNotCreatedException {
		Employee employee=new Employee();
		Employee employee2=new Employee();
		employee.createEmployee("navi","551","tdp", 1);
		employee2.createEmployee("navi","551","tdp",1);
		System.out.println("employee");
		if(employee.equals(employee2))
		{
			throw new EmployeeNotCreatedException("employee not created");
		}
		

	}

}
