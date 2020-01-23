package comm.mycompany.Spring_id;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Employee;

public class App 
{
    public static void main( String[] args )
    {
       try {
    	   ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	   Employee theemp=context.getBean("theemp",Employee.class);
    	System.out.println(theemp.getEmpAddress());
    	System.out.println(theemp.getEmpId());
		
	} catch (Exception e) {
	
	}
    }
}
