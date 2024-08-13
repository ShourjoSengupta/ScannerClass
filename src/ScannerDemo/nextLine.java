package ScannerDemo;
import java.util.Scanner;

public class nextLine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String value = input.nextLine();
		System.out.println("Entered your name as...:  "+ value);
		input.close();
	}

}
