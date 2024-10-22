package radixconverter;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class RadixConverter {

	public static void simpleConv(String a, int b, int c) {
		System.out.println("Result: " + Integer.toString(Integer.parseInt(a, b), c) + "\u0007");
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	public static void main(String[] args) {
		int x = -1;
		
		while(x != 0) {
			System.out.println("Note: Functionality is very basic at this point. As of now, only conversion of integers between two bases between 2 and 36, inclusive, is supported.");
			System.out.println();
			System.out.println("Menu:");
			System.out.println();
			System.out.println("0. Quit");
			System.out.println("1. Simple Base Conversion");
			
			System.out.print("Please select an option: ");
			Scanner s = new Scanner(System.in);
			x = s.nextInt();
			
			if(x == 1) {
				System.out.println();
				System.out.print("Please input an integer: ");
				String input = s.next();
				System.out.println();
				System.out.print("Please input the base of the integer: ");
				int iB = s.nextInt();
				System.out.println();
				if(iB < 2 || iB > 36) {
					System.out.println("Error: Base must be between 2 and 36, inclusive");
					System.out.println();
					System.out.print("Please input the base of the integer: ");
					iB = s.nextInt();
					System.out.println();
				}
				System.out.print("Please input the base you want to convert the integer to: ");
				int oB = s.nextInt();
				System.out.println();
				if(oB < 2 || oB > 36) {
					System.out.println("Error: Base must be between 2 and 36, inclusive");
					System.out.println();
					System.out.print("Please input the base you want to convert the integer to: ");
					oB = s.nextInt();
					System.out.println();
				}
				
				simpleConv(input, iB, oB);
			}
		}
	}

}
