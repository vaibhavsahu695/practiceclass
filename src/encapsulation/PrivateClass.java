package encapsulation;

public class PrivateClass {

	private String name;
	private String email;
	private String password;
	private String mobile;
	private String address;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getEmailID()
	{
		return email;
	}
	public void setEmailID(String email)
	{
		this.email=email;
	}
	public String getPass()
	{
		return password;
	}
	public void setPass(String password)
	{
		this.password=password;
	}
	public String getMobile()
	{
		return mobile;
	}
	public void setMobile(String mobile)
	{
		this.mobile=mobile;
	}
	public String getAdress()
	{
		return address;
	}
	public void setAdress(String address)
	{
		this.address=address;
	}
	
	
}
