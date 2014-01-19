package controllers;

import java.rmi.Naming;

import data.Member;
import remote.payment.PaymentSessionFacade;

public class PaymentController extends ConexionController{

	private PaymentSessionFacade reServer;
	
	public PaymentController(String name) throws Exception {
		super();
		reServer= (PaymentSessionFacade) Naming.lookup(name);
	
	}

	public double checkAmount(String m) {
		return reServer.currentAmount(m);
	}

}
