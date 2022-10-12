package exercise1;

public class Commission extends Hourly
{
	
	private double totalSales;
	private double commisionRate;
	
	public Commission(String eName, String eAddress, String ePhone, 
		String socSecNumber, double rate, double commRate) 
	{
		super(eName, eAddress, ePhone, socSecNumber, rate);
		this.commisionRate = commRate;
	}
	
	public void addSales(double Sales) 
	{
		this.totalSales = Sales;
	}
	
	public double pay()
	{
		double payment = super.pay() + commisionRate;
		totalSales = 0;
		return payment;
	}
	
	public String toString()
	{
		
	}
	
	
	
}
