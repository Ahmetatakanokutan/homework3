package abstracts;

import java.rmi.RemoteException;

import entities.Customer;

public abstract class CustomerManager implements CustomerService{

	public void save(Customer customer) throws RemoteException {
		System.out.println("veritabanina kaydedildi : " + customer.getFirstName());
		
	}

}
