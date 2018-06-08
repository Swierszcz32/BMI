package pl.java.BMI;

public class ConvertVariable {
	
	public int converting(int height, int weight) {
		TransmittedVariable tv = new TransmittedVariable(height, weight);
		int bmi = weight/(height*height);
		return bmi;
	}
	
}
