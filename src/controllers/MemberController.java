package controllers;

import remote.ManagementSessionFacade;

public class MemberController extends ConexionController{

	public MemberController(String name) throws Exception {
		super(name);
	}

	public boolean signIn(String user, String pass) {
		return ((ManagementSessionFacade) reServer).signIn(user, pass);
	}

	
}
