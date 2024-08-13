package ScannerDemo;

import java.util.Scanner;

public class next {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		
		String data1 =input.next();
		System.out.println("Entered name is: "+ data1);
		input.close();

	}

}
