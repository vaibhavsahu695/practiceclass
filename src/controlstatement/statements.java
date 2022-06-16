package controlstatement;

public class statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//reverse number by using while
		
		int num=7875;
		int reverse=0;
		
		while(num !=0)
		{
			reverse=reverse*10+num%10;
			
			num=num/10;
		}
		System.out.println(reverse);
		
	}

}
