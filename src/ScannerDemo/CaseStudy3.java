package ScannerDemo;
import java.util.*;
public class CaseStudy3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		int b = Math.abs(a);
		
		System.out.println("Absolute value of "+ a + " is "+ (b));
		sc.close();
	}
}
