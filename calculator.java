package week1.day2;

public class calculator {
	public int getAdd(int a, int b) {
		return a+b;
	}
	
public double getSub(double a, double b) {
	return a-b;
	}

public double getMuliply(double a, double b) {
	return a*b;
}

public double getDivide(double a, double b) {
	return a/b;
}
	public static void main(String[] args) {
		calculator calculator = new calculator();
		System.out.println(calculator.getAdd(1, 1));
		System.out.println(calculator.getSub(3, 1));
		System.out.println(calculator.getMuliply(3, 2));
		System.out.println(calculator.getDivide(10, 2));
		

	}

}
