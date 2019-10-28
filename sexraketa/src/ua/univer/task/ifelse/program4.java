package ua.univer.task.ifelse;

public class program4 {
	public static int findMax(int x, int y){
		int myMax;
		if(x<y) myMax = y;
		else myMax = x;
		return myMax;
		
	}
	public static int findMin(int x, int y) {
		int myMin;
		if (x<y) myMin = x;
		else myMin = y;
		return myMin;
	}

	public static void main(String[] args) {
		int a = 2;
		int b = 4;
		int c = 8;
		int d = 12;
		int e = 5;
		int myMax = Math.max(Math.max(Math.max(Math.max(a, b),c),d),e);
		int myMin = Math.min(Math.min(Math.min(Math.min(a ,b),c),d),e);
		 System.out.println("min value = "+myMin);
		 System.out.println("max value = "+myMax);
	}

}
