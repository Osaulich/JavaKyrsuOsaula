package ifelse;

import java.util.Scanner;

public class ifelse3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int a = in.nextInt();
        int b = 10;
        if(a > 0) 
        	System.out.println(a+1);
        if (a == 0)
        	System.out.println(b);     	
        else
        	System.out.println(a-2);
	}

}
