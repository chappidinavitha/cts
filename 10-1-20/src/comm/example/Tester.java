package comm.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class Tester {
	public static void main(String args[])
	{
		Set<Student> set=new HashSet<Student>();
		set.add(new Student("navi","chappidi",551,9.0));
		set.add(new Student("navitha","chappidi",552,8.0));
		set.add(new Student("navitha1","chappidi2",553,7.0));
		/***Iterator<Student> itr=set.iterator();
		while(itr.hasNext())
		{
			Student student=itr.next();
			System.out.println(itr+"\n");
		}**/
		for(Student e:set)
		{
			System.out.println(e+"\n");
		}
		
		
	}

}
