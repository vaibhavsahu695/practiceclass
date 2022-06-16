package generalization;

public class Jio implements SimCard{

	@Override
	public void sms() {
		// TODO Auto-generated method stub
		System.out.println("sms:100");
	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("calling: unlimited");
	}

	@Override
	public void internet() {
		// TODO Auto-generated method stub
		System.out.println("internet:3GB");
	}

	
	
}
