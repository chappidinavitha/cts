package comm.example;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Student implements Comparable<Student>{
	private String firstName;
	private String lastName;
	private int sId;
	private double Gpa;
	@Override
	public int compareTo(Student student)
	{
		int result=0;
		if(this.getGpa()>student.getGpa())
		{
			result=1;
		}
		else if(this.getGpa()<student.getGpa())
		{
			result=-1;
		}
		else
		{
			result=0;
		}
		return result;
	}
	
	

}
