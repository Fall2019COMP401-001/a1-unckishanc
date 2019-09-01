package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int pCount = scan.nextInt();

		String[] pName = new String[pCount];
		Double[] pCost = new Double[pCount];
		for (int i = 0; i < pCount; i++) {
			pName[i] = scan.next();
			pCost[i] = scan.nextDouble();
			
		}
		int cCount = scan.nextInt();
		String[] firstName = new String[cCount];
		String[] lastName = new String[cCount];
		Double[] totalCost = new Double[cCount];
		
		for (int zero = 0; zero < cCount; zero++) {
			totalCost[zero] = 0.0;
		}
		
		for (int a = 0; a < cCount; a++) {
			firstName[a] = scan.next();
			lastName[a] = scan.next();
			int item = scan.nextInt();
			
			for (int b = 0; b < item; b++) {
				int quant = scan.nextInt();
				String typeNames = scan.next();
				
				int index = 0;
				for (int l = 0; l < pCount; l++) {
					if (typeNames.equals(pName[l])) {
						index = l;
					}
				}
				totalCost[a] += pCost[index] * quant;
			}
		}
		int big = 0;
		int small = 0;
		double sum = 0;
		for (int x = 0; x < cCount; x++) {
			if(totalCost[x] > totalCost[big]) {
				big = x;
			}
			if (totalCost[x] < totalCost[small]) {
				small = x;
			}
			sum += totalCost[x];
		}
		System.out.println("Biggest: " + firstName[big] + " " + lastName[big] + " (" + String.format("%.2f", totalCost[big]) + ")");
		System.out.println("Smallest: " + firstName[small] + " " + lastName[small] + " (" + String.format("%.2f", totalCost[small]) + ")");
		System.out.println("Average: " + String.format("%.2f", (sum/totalCost.length)));
	scan.close();
	}
}
