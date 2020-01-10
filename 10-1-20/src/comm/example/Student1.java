package comm.example;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode

public class Student1  {
	private String sfName,slName;
	 int sid;
     double sgpa;
	public Student1(String sfName,String slName, int sid, double sgpa) {
		if (sfName== null || slName == null || sid == 0 || sgpa == 0.0) throw new NullPointerException();
		this.sfName = sfName;
		this.slName = slName;
		this.sid = sid;
		this.sgpa = sgpa;
	}
	
	
	

}
