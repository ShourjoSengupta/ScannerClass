package ScannerDemo;
import java.util.*;
public class CaseStudy4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Double Value: ");
		double d = sc.nextDouble();
		System.out.println("Entered Double Value: " + d);
		
		System.out.println("Enter a Boolean Value: ");
		boolean b = sc.nextBoolean();
		System.out.println("Entered Boolean Value: " + b);
		
		System.out.println("Enter Something:  ");
		Boolean s = sc.hasNext();
		System.out.println("Entered value is not empty. Yes/No? "+ s);
		Boolean i = sc.hasNextInt();
		System.out.println("Entered value is an integer. Yes/No? "+ i);
		Boolean j = sc.hasNextInt();
		System.out.println("Is there another line in the input? Yes/No? "+ j);
		
	}
}
