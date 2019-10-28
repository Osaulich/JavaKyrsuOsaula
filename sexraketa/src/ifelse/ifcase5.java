package ifelse;

public class ifcase5 {

	public static void main(String[] args) {
		int a = 5;
		int b = -2;
		int c = 1;
		int countNegative = 0;
		int countPositive = 0;
		if (a > 0) countPositive++;
		else
			countNegative++;
		if (b > 0) countPositive++;
		else
			countNegative++;
		if (c > 0) countPositive++;
		else
			countNegative++;
		System.out.println(countNegative);
		System.out.println(countPositive);
		

	}

}
