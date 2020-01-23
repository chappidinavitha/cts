package comm.mycompany.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import comm.example.onetoone.Task;
import comm.example.onetoone.ToDo;

public class App 
{
    public static void main( String[] args )
    {
    	try {
    		SessionFactory factory=new Configuration()
    				.configure().addAnnotatedClass(Task.class)
    				.addAnnotatedClass(ToDo.class).buildSessionFactory();
        	Session session=factory.openSession();
        	Task task=new Task("hibernate","navitha");
        	task.setToDo(new ToDo(1234,"hibernate"));
        	session.getTransaction().begin();
    		session.save(task);
    		session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
    	
    }
}
