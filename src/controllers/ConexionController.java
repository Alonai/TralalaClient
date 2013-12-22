package controllers;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.Remote;


public abstract class ConexionController { 
	
	protected Remote reServer;
	
	public ConexionController(String name) throws Exception{
		if(System.getSecurityManager() == null){
			System.setSecurityManager(new RMISecurityManager());
		}
		this.reServer= Naming.lookup(name);
	}
	
}