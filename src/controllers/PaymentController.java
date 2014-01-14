package controllers;

public class PaymentController extends ConexionController{

	public PaymentController(String name) throws Exception {
		super(name);
	
	}

	public double checkAmount() {
		return reServer.currentAmount();
	}

}
