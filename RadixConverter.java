package radixconverter;
import java.util.Scanner;

public class RadixConverter {

	public static void simpleConv(String a, int b, int c) {
		System.out.println("Result: " + Integer.toString(Integer.parseInt(a, b), c));
	}
	
	public static void main(String[] args) {
		int x = -1;
		
		while(x != 0) {
			System.out.println("Note: Functionality is very basic at this point. As of now, only conversion of integers between two bases between 1 and 36, inclusive, is supported.");
			System.out.println("Please select an option:");
			System.out.println("0. Quit");
			System.out.println("1. Simple Base Conversion");
			
			Scanner s = new Scanner(System.in);
			x = s.nextInt();
			
			if(x == 1) {
				System.out.println("Please input an integer:");
				String input = s.next();
				System.out.println("Please input the base of the integer:");
				int iB = s.nextInt();
				if(iB < 1 || iB > 36) {
					System.out.println("Error: Base must be between 1 and 36, inclusive");
					System.out.println("Please input the base of the integer:");
					iB = s.nextInt();
				}
				System.out.println("Please input the base you want to convert the integer to:");
				int oB = s.nextInt();
				if(oB < 1 || oB > 36) {
					System.out.println("Error: Base must be between 1 and 36, inclusive");
					System.out.println("Please input the base you want to convert the integer to:");
					oB = s.nextInt();
				}
				
				simpleConv(input, iB, oB);
			}
		}
	}

}
