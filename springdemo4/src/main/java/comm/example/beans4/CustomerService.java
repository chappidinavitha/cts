package comm.example.beans4;

import java.sql.SQLException;

public interface CustomerService {
	
	 public Customer createCustomer(Customer customer)throws SQLException;
}
