package pkg1;

public class ClassP {
	
	int a=10;
	public ClassP()
	{
		
		
		
	}
	public ClassP(int b)
	{
		System.out.println(b);
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		m1();
		new ClassP(20);
		ClassP kk= new ClassP(101);
		System.out.println(kk.a);
		
	}
	
	public static void m1()
	{
		ClassP k= new ClassP();
		System.out.println(k.a);
		
	}

}
