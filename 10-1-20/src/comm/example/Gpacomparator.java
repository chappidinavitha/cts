package comm.example;

import java.util.Comparator;

public class Gpacomparator implements Comparator<Student1> {
	@Override
	public int compare(Student1 o1,Student1 o2)
	{
		if(o1.getSgpa()>o2.getSgpa())
		{
			return 1;
		}
		else if(o1.getSgpa()<o2.getSgpa())
		{
			return -1;
		}
		else
		{
			return 0;
		}
			
	}
	

}
