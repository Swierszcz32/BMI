package pl.java.BMI;

public class ConvertVariable {
	
	public int converting(int height, int weight) {
		TransmittedVariable tv = new TransmittedVariable(height, weight);
		int bmi = weight/(height*height);
		return bmi;
	}
	public double converting(double height, double weight) {
		TransmittedVariable tv = new TransmittedVariable(height, weight);
		double bmi = weight/(height*height);
		return bmi;
	}
	
	
}
