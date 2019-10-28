package ua.univer.task.ifelse;

public class program3 {

	public static void main(String[] args) {
		int A = 7;
		int B = 6;
		int C = 7;
		int D = 7;
		int E = 5;
		int myMax = A;
		if (myMax < B) myMax = B;
		if (myMax < C) myMax = C;
		if (myMax < D) myMax = D;
		if (myMax < E) myMax = E;
		System.out.println("max value = "+myMax);
		int count = 0;
		if (myMax == A) count++;
		if (myMax == B) count++;
		if (myMax == C) count++;
		if (myMax == D) count++;
		if (myMax == E) count++;
		System.out.println("value of maximum numbers = "+ count);

	}

}
