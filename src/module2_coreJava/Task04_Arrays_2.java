package module2_coreJava;

import java.util.Scanner;

public class Task04_Arrays_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n =scanner.nextInt();
		int[] arr= new int[n];
		for(int i =0; i<n; i++) {
			arr[i]=scanner.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>=arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Smallest Number :" +arr[0]);
		System.out.println("Biggest Number :" +arr[n-1]);
	}
}
