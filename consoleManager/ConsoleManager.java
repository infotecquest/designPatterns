package designPatterns.consoleManager;

import java.util.Scanner;

public class ConsoleManager {

	private Scanner scanner;
	private String input;
	
	public ConsoleManager(){
		scanner = new Scanner(System.in);
	}

	public String getConsoleValue(){
		System.out.println("Input: ");
		input = scanner.next();
		return input;
	}
	
	public int getConsoleValueAsInt(){
		int value = 0;
		try {
			value = Integer.parseInt(getConsoleValue());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return value;
	}
}
