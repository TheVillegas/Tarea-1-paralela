package Client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RunClient {
	public static void(String [] args ) throws RemoteException , NotBoundException {
		Client client = new Client();
		client.startClient();
		
		System.out.println("Cliente Aribba!!");
		
		
		
	}

}
