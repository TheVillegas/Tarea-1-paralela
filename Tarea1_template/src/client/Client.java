package client;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

import common.InterfazDeServer;
import common.Persona;


public class Client {
	
	private InterfazDeServer = server;
	public client () {};
	
	
	public void startClient() throws RemoteException() {
		Registry = registry = LocateRegistry.getRegistry("localhost",1009);
		server = (InterfazDeServer) registry.lookup("server");
		
	}
	
	public void mostrarPersonas() {
		ArrayList<Persona> personas = server.getPersona();
		for(Persona persona : personas) {
			System.out.println(persona.getNombre()+ ""+persona.getEdad);
		}
	}
	
	
	

}
