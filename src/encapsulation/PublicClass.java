package encapsulation;

public class PublicClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 PrivateClass kk = new PrivateClass();
   kk.setName("vaibhav");
   kk.setEmailID("vaibhavsahu695@gmail.com");
   kk.setPass("Vaibhav@695");
   kk.setMobile("9511232485");
   kk.setAdress("chhayacolony");
   
   System.out.println(kk.getName());
   System.out.println(kk.getEmailID());
   System.out.println(kk.getPass());
   System.out.println(kk.getMobile());
   System.out.println(kk.getAdress());




	}

}
