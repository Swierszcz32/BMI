package pl.java.BMI;

public class TransmittedVariable {
	
	private double height;
	private double weight;
	
	public TransmittedVariable(double height,double weight) {
		// TODO Auto-generated constructor stub
		this.height = height;
		this.weight = weight;
	}
	public double getHeight() {
		return height/100;
	}
	
	public double getWeight() {
		return weight;
	}
	
	@Override
	public String toString() {
		return "TransmittedVariable [height=" + height + ", weight=" + weight + "]";
	}
	
	

}
