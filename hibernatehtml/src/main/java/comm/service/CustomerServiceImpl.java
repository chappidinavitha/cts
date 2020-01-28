package comm.service;

import comm.Dao.CustomerDAO;
import comm.Dao.CustomerDAOImpl;
import comm.model.Customer;

public class CustomerServiceImpl implements CustomerService{
	private CustomerDAO dao;
	{
		dao=new CustomerDAOImpl();
	}

	@Override
	public Customer createCustomer(Customer customer) {

		return dao.createCustomer(customer);
	}

}



