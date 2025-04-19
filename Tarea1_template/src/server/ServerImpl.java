package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import common.InterfazDeServer;
import common.Persona;


public class ServerImpl implements InterfazDeServer{

	private ArrayList<Persona> BD_personas = new ArrayList<>();
	
	public ServerImple() throws RemoteExection {
		UnicastRemoteObject.exportObject(this,0);
		crearBD();
	}
	
	public void crearBD() {
		Persona persona1 = new Persona("matias",27);
		Persona persona2 = new Persona ("Maria Eugenia",31);
		
		
		BD_personas.add(persona1);
		BD_personas.add(persona2);
	}
	
	@Override
	
	public ArrayList<Persona> getPersona() {
		return BD_personas;
		
	}
	
	public Persona Personas (String nombre , int edad) {
		Persona persona = new Persona (nombre,edad)M
		return persona;
	}
	
}
