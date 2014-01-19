package controllers;

import java.rmi.RMISecurityManager;


public abstract class ConexionController { 
	
	
	public ConexionController() throws Exception{
		if(System.getSecurityManager() == null){
			System.setSecurityManager(new RMISecurityManager());
		}
	}
	
}
