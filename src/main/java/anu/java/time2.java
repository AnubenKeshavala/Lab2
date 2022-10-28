package anu.java;

import java.util.Calendar;

public class time2 {
	
	private String timeP;
	private final String Morning = "Good Morning, Anuben Keshavala" ;
	private final String Afternoon = "Good Afternoon, Anuben Keshavala";
	private final String Evening = "Good Evening, Anuben Keshavala";

	public String getSetTime() {
		
		Calendar time = Calendar.getInstance();
		
		int hour = time.get(Calendar.HOUR_OF_DAY);
		
		if (hour >= 18)
		{
			timeP = Evening;
		}
		else if (hour >= 12)
		{
			timeP = Afternoon;
		}
		else {
			timeP = Morning;
		}
		return timeP;
	}

	public String getTimeP() {
		return timeP;
	}
}
