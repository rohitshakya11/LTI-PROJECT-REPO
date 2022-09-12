/**
 * 
 */
package com.lti.app;

/**
 * @author 10710128
 *
 */
public class Color {

	/**
	 * @param args
	 */
	// Declaring ANSI_RESET so that we can reset the color
	public static final String ANSI_RESET = "\u001B[0m";

	// Declaring the color
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	
	// Declaring the background color
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
	
	//methods for text colors
	public static void redText(String s) {
		System.out.println(ANSI_RED + s + ANSI_RESET);
	}
	
	public static void greenText(String s) {
		System.out.println(ANSI_GREEN + s + ANSI_RESET);
	}
	
	public static void yellowText(String s) {
		System.out.println(ANSI_YELLOW + s + ANSI_RESET);
	}
	
	public static void blueText(String s) {
		System.out.println(ANSI_BLUE + s + ANSI_RESET);
	}
	
	public static void purpleText(String s) {
		System.out.println(ANSI_PURPLE + s + ANSI_RESET);
	}
	
	public static void cyanText(String s) {
		System.out.println(ANSI_CYAN + s + ANSI_RESET);
	}
	
	public static void whiteText(String s) {
		System.out.println(ANSI_WHITE + s + ANSI_RESET);
	}
	
	//methods for text background
	public static void redBackground(String s) {
		System.out.println(ANSI_RED_BACKGROUND + s + ANSI_RESET);
	}

	// Main driver method
	public static void main(String[] args) {
		
		redText("this text is red");
		greenText("this text is green");
		yellowText("this text is yello");
		blueText("this text is blue");
		purpleText("this text is purple");
		cyanText("this text is cyan");
		whiteText("this text is white");
		
		redBackground(ANSI_WHITE+"this text has red background"+ANSI_RESET);
	}

}
