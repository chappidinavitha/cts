package comm.example;

import java.util.Comparator;

public class NameComp implements Comparator{

	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return (o1.getSfName().compareTo(o2.getSfName()));
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
