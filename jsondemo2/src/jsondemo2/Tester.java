package jsondemo2;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Tester {
	public static void main(String args[])
	{
		try {
			Student s=new Student();
			s=getObjectData(s);
			ObjectMapper obj=new ObjectMapper();
			String str=obj.writeValueAsString(s);
			System.out.println(str);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

	private static Student getObjectData(Student s)
	{
		s.setfName("navitha");
		s.setlName("chappidi");
	
		return s;
	}

}
