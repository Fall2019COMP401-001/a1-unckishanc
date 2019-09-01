package a1;

import java.util.Scanner;


public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int count = scan.nextInt();
		String[] values = new String[count];
		for (int i = 0; i < count; i++) {
			String firstName = scan.next();
			String lastName = scan.next();
			int itemCount = scan.nextInt();
			double total = 0;
			values[i] = firstName.charAt(0) + ". " + lastName + ": ";
			for (int c = 0; c < itemCount; c++) {
				int productCount = scan.nextInt();
				String itemName = scan.next();
				double price = scan.nextDouble();
				total += productCount * price;
			}
			values[i] += total;
		}
		for (int v = 0; v < count; v++) {
			System.out.println(values[v]);
		}
				
		scan.close();
		
	}
}
