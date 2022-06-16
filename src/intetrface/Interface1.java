package intetrface;

public interface Interface1 {

	String g="vaibhav";
	
	int a=50;
	
	void m1();
	void m2();
	
	public static void m3()
	{
		System.out.println("hiiiii");
	}
	default void m4()
	{
		System.out.println("hellooo");
	}
	
}
