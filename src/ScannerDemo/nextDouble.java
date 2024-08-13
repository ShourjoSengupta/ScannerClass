package ScannerDemo;

import java.util.Scanner;

public class nextDouble {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a double value: ");
		
		double data1 =input.nextDouble();
		System.out.println("Entered Double value is: "+ data1);
		input.close();

	}

}
