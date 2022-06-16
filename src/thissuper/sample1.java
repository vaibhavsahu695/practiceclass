package thissuper;

public class sample1 extends sample {

 int a=40;

 

	public  void m1()
	
	{
		a=50;
		int a=60;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sample1 k= new sample1();
		k.m1();

	}

}
