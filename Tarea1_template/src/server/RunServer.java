package server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.AlreadyBoundException;



import common.InterfazDeServer;
import common.Persona;


public class RunServer {
	public static void main(String args[]) throws RemoteException,  AlreadyBoundException{
		InterfazDeServer server = new ServerImpl();
		Registry registry = LocateRegistry.createRegistry(1009);
		
		
	}

}
