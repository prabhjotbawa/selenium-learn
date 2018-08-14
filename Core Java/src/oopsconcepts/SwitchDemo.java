package oopsconcepts;


public class SwitchDemo {

	public static void main(String[] args) {

		int numDays = numOfDays(2000,3);
		System.out.println("Number of days in given year are: "+ numDays);
		
	}

	static int numOfDays(int year,int month)
	{
		int numDays=0;
		switch(month)
		{
		case 1:
			
			numDays=31;
			break;
		case 2:
			if(year %400 ==0)
			{
			numDays=29;
			}
			else
			{
				numDays=28;
			}
				break;
				
	     default:
	    	 System.out.println("Have fun");
	    	 break;
		}
		
		return numDays;
		
	}
	
}
