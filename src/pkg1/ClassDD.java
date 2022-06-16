package pkg1;

public class ClassDD {

	
	static int y=60;
	
	
	public ClassDD() {
		
		
		
		
	}
	public ClassDD(int y) {
		this.y=y;
		
		System.out.println(this.y);
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		
//		m1();
//		m3(10,"ravi",1.23F);
		
//		for(int i=2; i<=100; i=i+2)
//		{
//			
//			System.out.println(i);
//			
//		}
		//descending order
//		for(int i=50; i>=1; i--)
//		{
//			
//			System.out.println(i);
//			
//		}
//		
//		for(int i=1; i<=10; i++) 
//		 { 
//		 System.out.println(i*2); 
//		 } 
//prime number
		
	
	
		
		
//		int i =0;
//	       int num =0;
//	       //Empty String
//	       String  primeNumbers = "";
//
//	       for (i = 1; i <= 100; i++)         
//	       { 		  	  
//	          int counter=0; 	  
//	          for(num =i; num>=1; num--)
//		  {
//	             if(i%num==0)
//		     {
//	 		counter = counter + 1;
//		     }
//		  }
//		  if (counter ==2)
//		  {
//		     //Appended the Prime number to the String
//		     primeNumbers = primeNumbers + i + " ";
//		  }	
//	       }	
//	       System.out.println("Prime numbers from 1 to 100 are :");
//	       System.out.println(primeNumbers);
	       
	       
	       
	       
	       int a=10;
	   	while(a>=1)
	   	{
	   		System.out.println(a);
	   		
	   		a--;
	   	}
	   	String s="";
	   	
	   	for(int i=1;i<=50;i++)
	   	{
	   		int count=0;
	   		int num=i;
	   		
	   		while(num>=1)
	   		{
	   			if(i%num==0)
	   			{
	   				count++;
	   			}
	   			num--;
	   		}
	   		if(count==2)
	   		{
	   			s=s +i +" ";
	   			
	   		}
	   		
	   	}
	   	System.out.println("prime numbers from 1 to 50");
	   	System.out.println(s);
	   	
	   	
	   	 
	   		int i=10; //start condition
	   		do
	   		 { 
	   		 System.out.println(i); // 10 
	   		 i++; //11 // increment or decrement
	   		 } 
	   		while (i<=5); 
	   		
	   	
	   	int k=20;
	   	do {
	   		
	   		System.out.println(k);
	   		k++;
	   	}while(k<=30);
	   	
	   	
	   	ClassDD ll= new ClassDD();
	   	
	   	
	   	System.out.println();
	   	
	   	ClassDD l= new ClassDD(200);
	   	
System.out.println(l.y);
new ClassDD(50);
	   	
	   	
	   	
	   	
	   	
	   	
	   	
	   	
	   }
	
	
	
		
		
		
		
		
		
		 
		
		

	
	
public static void m1() {
	int a=10;
	System.out.println(a);
	m2();
}

public static void m2() {
	
	int b=20;
	System.out.println(b);



}
public static void m3(int a,String name, float f)
{
	System.out.println(a);
	System.out.println(name);
	System.out.println(f);

}

}
