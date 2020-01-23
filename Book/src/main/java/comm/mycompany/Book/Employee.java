package comm.mycompany.Book;

import java.time.LocalDate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type_of_Employee",discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("normal_Employee")
@Table(name="Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int eid;
	String eName;
	double eSalary;
	String eAddress;
	LocalDate dateOfSalary;
	public Employee()
	{
		
	}
	public Employee(String eName, double eSalary, String eAddress, LocalDate dateOfSalary) {
		super();
		this.eName = eName;
		this.eSalary = eSalary;
		this.eAddress = eAddress;
		this.dateOfSalary = dateOfSalary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double geteSalary() {
		return eSalary;
	}
	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}
	public String geteAddress() {
		return eAddress;
	}
	public void seteAddress(String eAddress) {
		this.eAddress = eAddress;
	}
	public LocalDate getDateOfSalary() {
		return dateOfSalary;
	}
	public void setDateOfSalary(LocalDate dateOfSalary) {
		this.dateOfSalary = dateOfSalary;
	}
	

}
