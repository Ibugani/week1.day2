package week1.day2;

public class ArmstrongNumber1 {

	public static void main(String[] args) {
		 
		int input = 153;
		
		int org = input;
		int sum = 0;
		while (input > 0) {
		int rem = input % 10;
		sum = sum + (rem*rem*rem);
		input = input/10;
		}
		
		if (org==sum) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
		 
	}

}
