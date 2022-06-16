package intetrface;

public class Implementation implements Interface1, Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Implementation kk= new Implementation();
kk.m1();
kk.m2();
kk.m4();
kk.m7();
kk.m8();
kk.m9();

	}

	@Override
	public void m7() {
		// TODO Auto-generated method stub
		System.out.println("123");
	}

	@Override
	public void m8() {
		// TODO Auto-generated method stub
		System.out.println("456");
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("789");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("999");
	}


	
	
}
