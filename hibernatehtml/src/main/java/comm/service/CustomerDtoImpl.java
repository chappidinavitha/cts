package comm.service;

import org.mapstruct.Mapper;

import comm.model.Customer;
import comm.model.CustomerDto;

@Mapper
public interface CustomerDtoImpl{
	public Customer customerDtoToCustomer(CustomerDto dto);

	CustomerDto customerToCustomerDto(Customer customer);
	

}
