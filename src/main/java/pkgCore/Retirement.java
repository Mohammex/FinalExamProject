package pkgCore;

public class Retirement {

	private int iYearsToWork;
	private double dAnnualReturnWorking;
	private int iYearsRetired;
	private double dAnnualReturnRetired;
	private double dRequiredIncome;
	private double dMonthlySSI;
	
	//TODO: Build the contructor, getters and setters for the attributes above.
	
	public double AmountToSave()
	{
		//TODO: Determine the amount to save each month based on TotalAmountSaved, YearsToWork
		//		and Annual return while working
		
		
		return (TotalAmountSaved()*dAnnualReturnWorking/12) / Math.pow(1-(1+dAnnualReturnWorking/12), - iYearsToWork);
	}
	
	public double TotalAmountSaved()
	{
		//	TODO: Determine amount to be saved based on Monthly SSI, Required Income, Annual return during retirement
		//		and number of years retired.
		//
		double years = iYearsRetired;
		double rate = dAnnualReturnRetired;
		double income = dRequiredIncome;
		double SSI = dMonthlySSI;
		return income / (Math.pow((1 + (rate/100.0)), years));
	}
}
