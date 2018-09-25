package islam.lib;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleScann {
	
	Scanner sc = new Scanner(System.in);
	
	public Double inputNumber() {
		return inputNumber(0.0, 0.0);
	}
	
	public Double inputNumber(Double startPosition, Double endPosition) {
		Double number = 0.0;
		boolean t = true;
		while(t) {
		while(t) {
	    	try {
	    		number = sc.nextDouble();
	    		break;
	    	} catch (InputMismatchException e) {
	    		System.out.println("Incorrect input");
	    		System.out.print("Enter again... \n");
	    	} finally {
	    		sc.nextLine();
	    	}
		}
		if(startPosition == 0 && endPosition == 0) endPosition = number;
		if(number >= startPosition && number <= endPosition) 
			break;
		else {
			System.out.println("Incorrect input it muste be: " + startPosition + " <=> " + endPosition + " \n");
		}
		}
		return number;
	}
	
}
