package pkg1;

public class Constructor {

	static int num1;
	static int num2;
	static String name;
	
	Constructor(int a, int b)
	{
		num1=a;
		num2=b;
	}
	Constructor(String c)
	{
		name=c;
		System.out.println(name);
	}
	public void addition()
	{
		int add=num1+num2;
		System.out.println(add);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor k= new Constructor(50,60);
	
		k.addition();
		Constructor kk= new Constructor("vaibhav");
		
		
	}

}
