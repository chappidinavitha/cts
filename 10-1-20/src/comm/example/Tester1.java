package comm.example;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Tester1 {
	public static void main(String[] args)
	{
		Comparator c=new NameComp();
		c=new Gpacomparator();
		Set<Student1> set=new TreeSet <Student1>(c);
		set.add(new Student1("Mike", "Hauffmann", 101, 4.0));
		set.add(new Student1("John", "Lynn", 102, 2.8));
		set.add(new Student1("Jim", "Max", 103, 3.6));
		set.add(new Student1("Kelly", "Grant", 104, 2.3));
		Object[] sArray=set.toArray();
		Student1 s;
		for(Object obj: sArray)
		{
			s=(Student1)obj;
			System.out.printf("Name = %s %s Id = %d gpa = %.1f",s.getSfName(),s.getSlName(),s.getSid(),s.getSgpa());
		
		System.out.println("\n");
		}
	}
}

