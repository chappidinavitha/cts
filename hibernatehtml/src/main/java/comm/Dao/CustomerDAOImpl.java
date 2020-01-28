package comm.Dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;

import comm.model.Customer;
import comm.utill.CustomerUtil;

public class CustomerDAOImpl implements CustomerDAO {
	private Session session;
	private EntityManager entityManager;

	{
		session=CustomerUtil.getMySessionFactory().openSession();
		session.getTransaction().begin();
		entityManager=session.
				getEntityManagerFactory().createEntityManager();
		session.getTransaction().commit();
	}

	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
		entityManager.persist(customer);
		entityManager.getTransaction().commit();
		return customer;
	}
	

}
