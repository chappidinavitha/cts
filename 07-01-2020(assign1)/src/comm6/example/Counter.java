package comm6.example;

public class Counter {
	
	private static Integer count=0;
	private String temp;
	
	public Counter() {
		super();
	}
	

	public Counter(String temp) {
		super();
		count++;
		this.temp = temp;
	}


	@Override
	public String toString() {
		
		return "count of object is:" + temp+count;
	}
	public static String display()
	{
		return count.toString();
	}
}
	
