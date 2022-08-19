package demo.service.customer;

import demo.model.Customer;

public interface CustomerService {

	
	public Customer findByCustomerId(int customerId);
	
	
	public Customer findByUsernameAndPassword(String username, String password);


	public String updateProfilePage(Customer customer);

}
