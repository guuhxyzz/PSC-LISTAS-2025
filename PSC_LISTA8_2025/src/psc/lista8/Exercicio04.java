package psc.lista8;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n = scanner.nextInt();
		
		System.out.println(PositivoNegativo(n));
		
		scanner.close();
	}
	
	static String PositivoNegativo(int n) {
		if (n == 0) {
			return "Zero";
		} else {
			return (n > 0)?"P":"N";
		}
	}

}
