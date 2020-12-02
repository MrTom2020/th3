package lethanhhiep1824801030217;

public class Address
{
	private String streetAddress = " ",city =" ",state = " ";
	private long zipCode = 0;
	public Address()
	{
		
	}
	public Address(String STREETADDRESS,String CITY,String STATE,long ZIPCODE)
	{
		this.city = CITY;
		this.state = STATE;
		this.streetAddress = STREETADDRESS;
		this.zipCode = ZIPCODE;
	}
	public String getstreetAddress()
	{
		return this.streetAddress;
	}
	public void setstreetAddress(String ST)
	{
		this.streetAddress = ST;
	}
	public String getCITY()
	{
		return this.city;
	}
	public void setcity( String city)
	{
		this.streetAddress = city;
	}
	public long getZICODE()
	{
		return this.zipCode;
	}
	public void setZIPCODE( long zipcode)
	{
		this.zipCode = zipcode;
	}
	public String getstate()
	{
		return this.state;
	}
	public void setstate( String state)
	{
		this.state = state;
	}
}
