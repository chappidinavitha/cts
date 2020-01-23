package beans;

public class Employeeadd implements Employee {
	EmployeeService employeeservice=null;
	

	public Employeeadd(EmployeeService employeeservice) {
		super();
		this.employeeservice = employeeservice;
	}

	@Override
	public String getEmpAddress() {
	
		return "the employee address is banglore";
	}

	@Override
	public String getEmpId() {
		
		return "the emp id is 51";
	}

}
