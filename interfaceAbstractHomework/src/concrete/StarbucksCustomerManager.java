package concrete;
import java.rmi.RemoteException;

import abstracts.*;
import entities.Customer;
public class StarbucksCustomerManager extends CustomerManager {

	CustomerCheckService customerCheckService;
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
@Override
public void save(Customer customer) throws RemoteException {
	if(customerCheckService.CheckIfRealPerson(customer)) {
		super.save(customer);
	}
	else {
		System.out.println("dogrulanamadi");
	}
}
}
