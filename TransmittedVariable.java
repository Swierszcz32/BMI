package pl.java.BMI;

public class TransmittedVariable {
	
//	private int height;
//	private int weight;
	private double height;
	private double weight;
	
	public TransmittedVariable(int height,int weight) {
		// TODO Auto-generated constructor stub
		this.height = height;
		this.weight = weight;
	}
	public TransmittedVariable(double height,double weight) {
		// TODO Auto-generated constructor stub
		this.height = height;
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "TransmittedVariable [height=" + height + ", weight=" + weight + "]";
	}
	
	

}
