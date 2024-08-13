package ScannerDemo;
import java.util.Scanner;

public class nextInt {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		
		int data1 =input.nextInt();
		System.out.println("Entered integer is: "+ data1);
		input.close();
		

	}

}
