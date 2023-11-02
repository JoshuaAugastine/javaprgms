package Array2d;

public class Array1 {

	public static void main(String[] args) {
		double[] numArray= {45.0,78.98,64.9,34.23,21.09};
		double sum = 0.0;
		
		for(double num: numArray) {
			sum += num;
			
		}
         double avg = sum/numArray.length;
         System.out.printf("The avg is : %.9f",avg); // .6f - it gives 6.890356 - 6 number of digits aftr the ans
	}

}
