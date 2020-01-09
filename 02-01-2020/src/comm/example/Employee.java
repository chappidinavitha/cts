package comm.example;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	//default constructor
	public Employee()
	{
		
	}
	//constructor overload
	
	public Employee(int employeeId, String employeeName, double salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	public static Employee createEmployee(int employeeId,String employeeName,int salary)
	{
		return new Employee(employeeId,employeeName,salary);
	}
	public String displayEmployeeDetails()
	{
		return "Employee ID:"+employeeId+"Employee Name:" +employeeName+"Employee Salary:" +salary;
		
	}
	

}
