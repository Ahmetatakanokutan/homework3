package abstracts;
import java.rmi.RemoteException;

import entities.Customer;

public interface CustomerService {

	public void save(Customer customer) throws RemoteException;
}
