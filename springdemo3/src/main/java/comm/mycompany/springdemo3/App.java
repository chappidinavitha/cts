package comm.mycompany.springdemo3;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import comm.example.bean3.Task;
import comm.example.bean3.ToDo;

public class App 
{
    public static void main( String[] args )
    {
    	try {
    		ApplicationContext context=new ClassPathXmlApplicationContext("appCon.xml");
        	ToDo todo=context.getBean("MyTodo",ToDo.class);
        	todo.setDate(LocalDate.now());
        	System.out.println(todo);
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
    	
    }
}
