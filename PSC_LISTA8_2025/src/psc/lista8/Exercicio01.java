package psc.lista8;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n = scanner.nextInt();
		listar(n);
		scanner.close();
	}
	
	static void listar(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < i; j++) { 
				System.out.print(i + " "); 
	            }
			System.out.println();
		}
	}
}
