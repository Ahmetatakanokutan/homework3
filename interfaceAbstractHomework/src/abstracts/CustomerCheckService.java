package abstracts;
import java.rmi.RemoteException;

import entities.*;
public interface CustomerCheckService {
public boolean CheckIfRealPerson(Customer customer) throws RemoteException  ;
}
