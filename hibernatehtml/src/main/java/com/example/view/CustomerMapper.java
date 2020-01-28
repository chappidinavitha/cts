package com.example.view;



import comm.model.Customer;
import comm.model.CustomerDto;
import comm.service.CustomerDtoImpl;

public class CustomerMapper implements CustomerDtoImpl {

	@Override
	public Customer customerDtoToCustomer(CustomerDto dto) {
		
		if(dto==null)
		{
			return null;
		}
		else
		{
			Customer customer=new Customer();
			customer.setUId(dto.getUId());
			customer.setFirstName(dto.getFirstName());
			customer.setLastName(dto.getLastName());
			customer.setEmail(dto.getEmail());
			return customer;
		}
		
	}

	@Override
	public CustomerDto customerToCustomerDto(Customer customer) {
		if(customer==null)
		{
			return null;
		}
		else {
			CustomerDto cDto=new CustomerDto();
			cDto.setUId(customer.getUId());
			cDto.setFirstName(customer.getFirstName());
			cDto.setLastName(customer.getLastName());
			cDto.setEmail(customer.getEmail());
			return cDto;
		}
	}

	

}