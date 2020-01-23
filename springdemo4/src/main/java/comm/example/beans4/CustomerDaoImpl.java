package comm.example.beans4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("dao")
public class CustomerDaoImpl implements CustomerDao {
	private DataSource dataSource;
	private Connection connection;
	private PreparedStatement pStatement;
	private static Logger logger=Logger.getLogger("comm.example.beans4.CustomerDaoImpl");
			
@Autowired
	public CustomerDaoImpl(DataSource datasource) {
		super();
		this.dataSource = datasource;
	}
@PostConstruct
public void init()
{
	try {
		logger.info("creating connection");
		connection=dataSource.getConnection();
		logger.info("connection established");
		
	} catch (SQLException e) {
		e.printStackTrace();
		logger.info("connection unsucces");
		
	}
}

	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
	
		pStatement=connection.prepareStatement("insert into customer(uid,firstName,lastName,email) values(?,?,?,?)");
		pStatement.setString(1, customer.getUid());
		pStatement.setString(2, customer.getFirstName());
		pStatement.setString(3, customer.getLastName());
		pStatement.setString(4, customer.getEmail());
		pStatement.executeUpdate();
		return customer;
	}

}
