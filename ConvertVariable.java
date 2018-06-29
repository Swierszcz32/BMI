package pl.java.BMI;

public class ConvertVariable {
	
	public double converting(double height, double weight) {
		TransmittedVariable tv = new TransmittedVariable(height, weight);
		double bmi = weight/(height*height);
		return bmi;
	}
	
	
}
