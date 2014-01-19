package controllers;

import java.rmi.Naming;

import remote.ManagementSessionFacade;

public class MemberController extends ConexionController{

	ManagementSessionFacade reServer;
	public MemberController(String name) throws Exception {
		super();
		reServer= (ManagementSessionFacade) Naming.lookup(name);
	}

	public boolean signIn(String user, String pass) {
		return reServer.signIn(user, pass);
	}

	
}
