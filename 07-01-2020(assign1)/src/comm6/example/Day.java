package comm6.example;

	public enum Day
	{
	   SUN("TODAY IS HOLIDAY",1),
	   MON("TODAY IS MONDAY ",2),
	   TUE("TODAY IS TUESDAY",3),
	   WED("TODAY IS WEDNESDAY",4),
	   THU("TODAY IS THU",5),
	   fRI("TIDAY IS FRI",6),
	   SAT("TODAY IS HOLIDAY",7);
	private final String message;
	private final int dayofweek;
	
     private Day(String m, int d) {
		message=m;
		dayofweek=d;
	}
     public String getMessage()
     {
    	 return message;
     }
     public int getDayOfWeek()
     {
    	 return dayofweek;
     }
	}