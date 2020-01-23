package comm.mycompany.springdemo4;

import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import comm.example.beans4.Customer;
import comm.example.beans4.CustomerDao;

public class App 
{
    public static void main( String[] args )
    {
        try { 
        	ApplicationContext context=new ClassPathXmlApplicationContext("appCon.xml");
        	CustomerDao dao=context.getBean("dao",CustomerDao.class);
        	Customer c=dao.createCustomer(new Customer(UUID.randomUUID().toString(),"John", "Doe", "john@email.com"));
        	System.out.println(c);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
    }
}
