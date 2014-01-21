package controllers;

import java.rmi.Naming;
import java.rmi.RemoteException;

import remote.payment.IPaymentSessionFacade;
import remote.payment.PaymentSessionFacade;

public class PaymentController extends ConexionController{

	private IPaymentSessionFacade reServer;
	
	public PaymentController(String name) throws Exception {
		super();
		reServer= (IPaymentSessionFacade) Naming.lookup(name);
	
	}

	public double checkAmount(String m) {
		try {
			return reServer.currentAmount(m);
		} catch (RemoteException e) {
			return 0;
		}
	}

}
