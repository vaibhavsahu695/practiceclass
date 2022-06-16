package stringmethods;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1.UPPERCASE & lowercase
		String name="vaibhav";
		System.out.println(name.toLowerCase());
		
		System.out.println(name.toUpperCase());
		
		//2.length 
		System.out.println(name.length());
		
		//3.equals
		String name1="Vaibhav";
		String name2="VAIBHAV";
		String name3="VAIBHAV";
		
		System.out.println(name1.equals(name3));
		System.out.println(name2.equals(name3));
		
		//4.equalsignore
		System.out.println(name1.equalsIgnoreCase(name3));
		
		//5.contains
		String team="Chennai Super Kings";
		String c="Chennai";
		String k="Kings";
		System.out.println(team.contains(k));
		System.out.println(c.contains(team));
		
		//6.isEmpty 
		String e="empty";
		String ee="";
		System.out.println(ee.isEmpty());
		System.out.println(e.isEmpty());
		
		//7.charAt
		String infinity="ILoveYouForInfinity";
		System.out.println(infinity.charAt(7));
		System.out.println(infinity.charAt(5));
		
		//8.startswith & endswith
		String bike="pulsar220";
		System.out.println(bike.startsWith("pu"));
		System.out.println(bike.endsWith("220"));
		System.out.println(bike.endsWith("lar"));
		
		//9.substring() or substring(start int, end int)
		String ipl="PunjabKings";
		System.out.println(ipl.substring(0));
		System.out.println(ipl.substring(5));
		System.out.println(ipl.substring(2, 5));
		
		//10.concat
		String j="Jai";
		String j1="Shree";
		String j2="Ram";
		System.out.println(j.concat(j2));
		System.out.println(j.concat(j1.concat(j2)));
		
		System.out.println(j+" "+j1+" "+j2);
		
		
		
		
		
		
		
		
	}

}
