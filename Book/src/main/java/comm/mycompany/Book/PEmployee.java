package comm.mycompany.Book;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("P-Employee")
@Table(name="PEmployee")
public class PEmployee extends Employee{
	private String eBonous;
	public PEmployee()
	{
		
	}
	public PEmployee(String eName, double eSalary, String eAddress, LocalDate dateOfSalary,String bon) {
		super(eName, eSalary, eAddress, dateOfSalary);
		eBonous=bon;
	}
	public String geteBonous() {
		return eBonous;
	}
	public void seteBonous(String eBonous) {
		this.eBonous = eBonous;
	}
	
	

}
