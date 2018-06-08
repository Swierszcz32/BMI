package pl.java.BMI;

public class TransmittedVariable {
	
	int height;
	int weight;
	
	public TransmittedVariable(int height,int weight) {
		// TODO Auto-generated constructor stub
		this.height = height;
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "TransmittedVariable [height=" + height + ", weight=" + weight + "]";
	}
	
	

}
