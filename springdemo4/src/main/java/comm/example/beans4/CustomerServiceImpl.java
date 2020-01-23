package comm.example.beans4;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerDao dao;

	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		
		return dao.createCustomer(customer);
	}

}
