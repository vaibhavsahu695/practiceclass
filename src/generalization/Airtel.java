package generalization;

public class Airtel implements SimCard {

	@Override
	public void sms() {
		// TODO Auto-generated method stub
		System.out.println("sms:300");
	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("calling:400");
	}

	@Override
	public void internet() {
		// TODO Auto-generated method stub
		System.out.println("internet: 4GB");
	}

}
