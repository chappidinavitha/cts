package comm.mycompany.Book;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("Hourly_Emp")
@Table(name="HourlyEmp")
public class HourlyEmp extends Employee {
	private double eHrate;
	private String area;
	public HourlyEmp()
	{
		
	}
	public HourlyEmp(String eName, double eSalary, String eAddress, LocalDate dateOfSalary,double eHrate, String area) {
		super(eName,eSalary,eAddress,dateOfSalary);
		this.eHrate = eHrate;
		this.area = area;
	}
	public double geteHrate() {
		return eHrate;
	}
	public void seteHrate(double eHrate) {
		this.eHrate = eHrate;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	

}
