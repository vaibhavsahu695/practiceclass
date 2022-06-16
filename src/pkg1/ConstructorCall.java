package pkg1;

public class ConstructorCall {
	
	
	 int eid; //non-static global variable 
	 int esal; 
	 static String eceoname; 
	 
	 public void showInfo() 
	 { 
	 System.out.println(eid+" :"+esal+ " :"+eceoname); 
	 
	
	 } 

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor j= new Constructor(60,80);
		j.addition();
	
		
	}

}
