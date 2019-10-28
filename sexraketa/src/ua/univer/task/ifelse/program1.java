package ua.univer.task.ifelse;

public class program1 {

	public static void main(String[] args) {
		String color = "green";
		if(color.equals("Green")) System.out.print("Go");
		else 
			if(color.equals("Yellow"))
			System.out.println("Wait");
			else
				if(color.equals("Red"))
					System.out.println("Stop");
				else System.out.println("Nothing. Error");
				
	}

}
