package controllers;

import java.rmi.RemoteException;

import remote.ManagementSessionFacade;

public class MemberController extends ConexionController{

	public MemberController(String name) throws Exception {
		super(name);
	}

	public boolean signIn(String user, String pass) {
		try {
			return ((ManagementSessionFacade) reServer).signIn(user, pass);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean createUser(String user, String pass) {
		try {
			return ((ManagementSessionFacade) reServer).registerUser(user, pass);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
