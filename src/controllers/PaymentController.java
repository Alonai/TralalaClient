package controllers;

import java.rmi.RemoteException;

import data.Member;
import remote.payment.PaymentSessionFacade;

public class PaymentController extends ConexionController{

	public PaymentController(String name) throws Exception {
		super(name);
	
	}

	public double checkAmount(String name) {
		try {
			return ((PaymentSessionFacade) reServer).currentAmount(name);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
