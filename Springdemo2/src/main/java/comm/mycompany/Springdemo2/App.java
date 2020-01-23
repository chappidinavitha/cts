package comm.mycompany.Springdemo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import comm.example.bean2.Employee;

public class App 
{
    public static void main( String[] args )
    {
        try {
        	ApplicationContext context=new ClassPathXmlApplicationContext("appCon.xml");
        	Employee employee=context.getBean("employee",Employee.class);
        	Employee employee1=context.getBean("employee",Employee.class);
        	System.out.println(employee==employee1);
        	System.out.println(employee);
        	
        	} catch (Exception e) 
        {
		      e.printStackTrace();
		}
    }
}
