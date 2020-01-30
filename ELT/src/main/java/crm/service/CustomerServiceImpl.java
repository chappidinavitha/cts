package crm.service;

import java.util.List;

import crm.dao.CustomerDAO;
import crm.dao.CustomerDAOImpl;
import crm.model.Customer;

public class CustomerServiceImpl implements CustomerService{
	private CustomerDAO dao;
	{
		dao=new CustomerDAOImpl();
	}

	@Override
	public Customer createCustomer(Customer customer) {
		
		return dao.createCustomer(customer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		
		return dao.getAllCustomer();
	}

	@Override
	public Customer findBuyId(int id) {
		
		return dao.findBuyId(id);
	}

	@Override
	public void update(Customer customer) {
		dao.update(customer);
		
	}

	@Override
	public void delete(Customer customer) {
		dao.delete(customer);
		
	}
	

}
