package comm6.example;

public class BoxingUnboxing {
	private Integer wInt;
	private int pInt;
	
	public BoxingUnboxing(Integer wInt, int pInt) {
		super();
		this.wInt = wInt;
		this.pInt = pInt;
	}

	
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "BoxingUnboxing [wInt=" +wInt +"pInt=" + pInt +"]";
	}
	public void display()
	{
		int tempP=wInt;//auto unboxing
		Integer tempW=pInt;//auto boxing
		System.out.println(this);
		System.out.printf("After Auto Boxing/unboxing: %d %d ",wInt,pInt);
	}
	
}

