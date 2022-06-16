package generalization;

public class GeneralizeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=====Schemes of Jio======");
		Jio j= new Jio();
		j.sms(); 
		j.calling();
		j.internet();
		
		System.out.println("=====Schemes of Vodafone======");
		Vodafone v= new Vodafone();
		v.sms();
		v.calling();
		v.internet();
		
		System.out.println("=====Schemes of Airtel======");
		Airtel a= new Airtel();
		a.sms();
		a.calling();
		a.internet();
	}

}
