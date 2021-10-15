import java.rmi.RemoteException;

import abstracts.*;
import adapters.*;
import entities.*;

import concrete.*;
public class Main {

	public static void main(String[] args) throws RemoteException {
		CustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
	customerManager.save(new Customer(5,"atakan","okutan",2002,"153243548695"));
	
	}

}
