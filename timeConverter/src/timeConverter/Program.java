package timeConverter;
/*
You need a program to convert days to seconds.
The given code takes the amount of days as input.
Complete the code to convert it to seconds and output the result.
 */

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();
		int hours = days * 24;
		int minutes = hours * 60;
		int seconds = minutes * 60;
		System.out.println(seconds);		
	}
}