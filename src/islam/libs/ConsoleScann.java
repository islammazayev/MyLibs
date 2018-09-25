package islam.libs;

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
	
	
	
	
	public int inputNumberInt() {
		return inputNumberInt(0, 0);
	}
	
	public int inputNumberInt(int startPosition, int endPosition) {
		int number = 0;
		boolean t = true;
		while(t) {
		while(t) {
	    	try {
	    		number = sc.nextInt();
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
	
	
	
	
	
//	public String inputText(String string) {
//		return inputText(" ");
//	}
	
	public String inputText() {
		String text = "";
		boolean t = true;
		   while(t) {
			   while(t){
			    	try {
			    		text = sc.nextLine();
			    		break;
			    	} catch (InputMismatchException e) {
			    		System.out.println("Invalid choise");
			    		System.out.print("Enter again... \n");
			    	} finally {
			    		sc.nextLine();
			    	}
			    
			    String inputText = sc.nextLine();
			if(inputText.equalsIgnoreCase("y")||inputText.equalsIgnoreCase("yes")) {
			    System.out.println("This will be fun");
			    break;
			} else if(inputText.equalsIgnoreCase("n")||inputText.equalsIgnoreCase("no")) {
			    System.out.println("Maybe next time");
			    break;
			} else {
			System.out.println("Invalid choise");

	   		}
		   }
		   }
		return text;
	}
}
