package comm6.example;

public abstract class Transport {
	private double start;
	private double eff;
	private double destination;
	protected double desti1;
	public double getStart() {
		return start;
	}
	public void setStart(double start) {
		this.start = start;
	}
	public double getEff() {
		return eff;
	}
	public void setEff(double eff) {
		this.eff = eff;
	}
	public double getDestination() {
		return destination;
	}
	public void setDestination(double destination) {
		this.destination = destination;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "start: "+getStart()+"eff: "+getEff()+"destination: "+getDestination();
	}
	public abstract void calculateDistance();
	public abstract void calculateEfficiency();
	



	

}
