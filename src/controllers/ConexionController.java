package controllers;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;


public abstract class ConexionController { 

	public void connect(String [] args){
		if(args.length != 3){
			System.out.println("uso: java [policy] [codebase] cliente.Cliente [host] [port] [server]");
			System.exit(0);
		}

		// Para que no nos descarguemos código remoto chungo
		if(System.getSecurityManager() == null){
			System.setSecurityManager(new RMISecurityManager());
		}
		try{
			// Look up name in RMI reg.
			String name= "//" + args[0] + ":" + args[1] + "/" + args[2];
			//TODO  IServer server= (IServer) Naming.lookup(name);
			
		}catch(Exception e){
			System.out.println("- Exception running the client: " + e.getMessage());
		}
		
		
	}
}
