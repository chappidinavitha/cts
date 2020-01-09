package comm.example;

import java.util.UUID;

public class Employee {
	private String empName;
	private String empId;
	private String empAddress;
	private double empExp;
	private Employee employee=null;
	public String getEmpName() {
		return empName;
	}    
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public double getEmpExp() {
		return empExp;
	}
	public void setEmpExp(double empExp) {
		this.empExp = empExp;
	}
	public Employee(String empName, String empId, String empAddress,double empExp)throws EmployeeNotCreatedException {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAddress = empAddress;
		this.empExp = empExp;
	}
	public Employee createEmployee(String empName,String empId,String empAddress,double empExp)throws EmployeeNotCreatedException
	{
		 employee=new Employee(UUID.randomUUID().toString(),empName,empId,empExp);
		 if(employee. getEmpExp()<2)
		 {
			 throw new EmployeeNotCreatedException("employee not created");
		 }
		 return employee;
		
	}
	public Employee() {
		super();
	
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {

		Employee employee=null;
		boolean isEqaul=false;
		if(obj instanceof Employee)
		{
			employee=(Employee) obj;
		}
	   if((this.getEmpName()==employee.getEmpName())&&(this.getEmpExp()==employee.getEmpExp()))
	   {
		   boolean isEqaual = true;
	   }
	  
	      return isEqaul;
	}
	@Override
	public String toString() {
		
		return "Employee [EmployeeName:"+empName+"EmployeeExp:"+empExp+"]";
	}
	
	
	
	
	
	
	
	
	

}
