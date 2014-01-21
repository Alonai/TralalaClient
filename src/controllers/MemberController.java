package controllers;

import java.rmi.Naming;
import java.rmi.RemoteException;

import remote.IManagementSessionFacade;
import remote.ManagementSessionFacade;

public class MemberController extends ConexionController{

	IManagementSessionFacade reServer;
	public MemberController(String name) throws Exception {
		super();
		reServer= (IManagementSessionFacade) Naming.lookup(name);
	}

	public boolean signIn(String user, String pass) {
		try {
			return reServer.signIn(user, pass);
		} catch (RemoteException e) {
			return false;
		}
	}
	
	public boolean createUser(String name, String pass) {
		try {
			return reServer.registerUser(name, pass);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	
}
