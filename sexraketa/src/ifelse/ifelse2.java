package ifelse;

import java.util.Scanner;

public class ifelse2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int a = in.nextInt();
        if(a > 0) System.out.println(a+1);
        else
        	System.out.println(a-2);


	}

}
