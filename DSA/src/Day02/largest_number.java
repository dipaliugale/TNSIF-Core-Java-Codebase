package Day02;
import java.util.Scanner;

public class largest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		int a = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int b = sc.nextInt();
		System.out.println("Enter Third Number: ");
		int c = sc.nextInt();
		
		int largest = (a > b) ? (a > c ? a : c) : (b > c  ? b : c);
		System.out.println("Largest number is: " + largest);

	}

}
