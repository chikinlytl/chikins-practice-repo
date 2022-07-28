package loanCalculator;
/*
You take a loan from a friend and need to calculate 
how much you will owe him after 3 months.
You are going to pay him back 10% of the remaining loan amount each month.
Create a program that takes the loan amount as input, 
calculates and outputs the remaining amount after 3 months.
 */
import java.util.Scanner;

public class Program
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		int payment = 0;
		//your code goes here
		for(int i = 1; i <= 3; i++){
			payment = amount / 10;
			amount = amount - payment;
			}
		System.out.println(amount);
	}
}