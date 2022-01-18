package basicassociate;

public class Date {
	//all calculations/formula:
	private int month; // 1-12
	private int day;// 1- 31 based on the month
	private int year; // any year
	
	public Date(int buwan,int araw,int taon)
	{
		month = checkMonth(buwan); //validate month
		year = taon;
		day = checkDay(araw); //validate day
		
		System.out.printf("Date object constructor for date %s\n",this.toString());
	} //end of constructor
	
	private int checkMonth(int testBuwan)
	{
		if(testBuwan > 0 && testBuwan <= 12)  // validate month
			return testBuwan;
		else // month invalid
		{   
			System.out.printf("Invalid month (%d) set to 1.", testBuwan);
			return 1; //return object in consistent state
		}
	}//end of method checkMonth
	
	//utility method to confirm proper day value based on month and year
	private  int checkDay(int testAraw)
	{
		int daysPerMonth[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		//check if day in range for month
		
		if (testAraw>0 && testAraw <= daysPerMonth[month])
			return testAraw;
		
		// check leap year
		if (month == 2 && testAraw == 29 && (year % 400 == 0 ||
				(year % 4 == 0 && year % 100 != 0)))
		return testAraw;
		
		
		System.out.printf("Invalid day (%d) set to 1.:",testAraw);
		return 1;	
	} // end of checkDay
	
	//return a String of the form month/day/year from date(buwan,araw,taon)
	//overrides
	public String toString() 
	{
		return String.format("%d %d %d", month,day,year);
	}//end of method string
	
}//end of class Date
