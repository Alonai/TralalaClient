package controllers;

public class MemberController extends ConexionController{

	public MemberController(String name) throws Exception {
		super(name);
	}

	public boolean signIn(String user, String pass) {
		return reServer.sigIn(user, pass);
	}

	
}
