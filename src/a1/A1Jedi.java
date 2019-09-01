package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		
		String[] names = new String[count];
		Double[] prices = new Double[count];
		
		for (int i = 0; i < count; i++) {
			names[i] = scan.next();
			prices[i] = scan.nextDouble();
		}
		
		int customers = scan.nextInt();

		String[] firstName = new String[customers];
		String[] lastName = new String[customers];
		
		int[] products = new int[count];
		int[] ifBought = new int[count];
		
		for (int a = 0; a < customers; a++) {
			firstName[a] = scan.next();
			lastName[a] = scan.next();
			int items = scan.nextInt();
			
			for (int b = 0; b < items; b++) {
				int quant = scan.nextInt();
				String product = scan.next();
				
				for (int c = 0; c < count; c++) {
					if (product == names[c]) {
						products[c] = quant;
						ifBought[c] += 1;
					}
				}
			}
		}
		for (int p = 0; p < count; p++) {
			System.out.println("" + ifBought[p] + " customers bought " + products[p] + " " + names[p]);
		}
		scan.close();
	}
}
