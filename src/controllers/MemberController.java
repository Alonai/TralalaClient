package controllers;

import java.rmi.Naming;
import java.rmi.RemoteException;

import remote.ManagementSessionFacade;

public class MemberController extends ConexionController{

	ManagementSessionFacade reServer;
	public MemberController(String name) throws Exception {
		super();
		reServer= (ManagementSessionFacade) Naming.lookup(name);
	}

	public boolean signIn(String user, String pass) {
		try {
			return reServer.signIn(user, pass);
		} catch (RemoteException e) {
			return false;
		}
	}

	
}
