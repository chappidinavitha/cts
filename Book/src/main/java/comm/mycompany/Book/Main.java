package comm.mycompany.Book;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Session session=null;
		try {
			
			session=new Configuration().configure("hibernate.cfg.xml")
					.addAnnotatedClass(Employee.class)
					.addAnnotatedClass(HourlyEmp.class)
					.addAnnotatedClass(PEmployee.class).buildSessionFactory()
					.getCurrentSession();
			Employee e1=new Employee("navitha",20000,"tadipatri",LocalDate.now());
			Employee e2=new HourlyEmp("naveen",30000,"karnataka",LocalDate.now(),300,"bang");
			Employee e3=new PEmployee("aswini",40000,"ap",LocalDate.now(),"five dollars");
			session.getTransaction().begin();
			session.save(e1);
			session.save(e2);
			session.save(e3);
			session.getTransaction().commit();
		System.out.println("done");
		}finally {
				//session.close();
			}
		
	

}
}
