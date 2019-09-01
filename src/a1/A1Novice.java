package a1;

import java.util.Scanner;


public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int count = scan.nextInt();
		String[] firstName = new String[count];
		String[] lastName = new String[count];
		Double[] total = new Double[count];
		for (int i = 0; i < count; i++) {
			firstName[i] = scan.next();
			lastName[i] = scan.next();
			int itemCount = scan.nextInt();
			double itemTotal = 0;
			for (int c = 0; c < itemCount; c++) {
				int productCount = scan.nextInt();
				String itemName = scan.next();
				double price = scan.nextDouble();
				itemTotal += productCount * price;
			}
			total[i] = itemTotal;
		}
		for (int v = 0; v < count; v++) {
			System.out.println(firstName[v].charAt(0) + ". " + lastName[v] + ": " + String.format("%.2f", total[v]));
		}
				
		scan.close();
		
	}
}
