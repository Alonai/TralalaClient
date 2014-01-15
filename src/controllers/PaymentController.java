package controllers;

import data.Member;
import remote.payment.PaymentSessionFacade;

public class PaymentController extends ConexionController{

	public PaymentController(String name) throws Exception {
		super(name);
	
	}

	public double checkAmount(Member m) {
		return ((PaymentSessionFacade) reServer).currentAmount(m);
	}

}
