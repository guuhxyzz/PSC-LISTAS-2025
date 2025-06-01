package psc.lista8;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		double[] valores = new double[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite um número: ");
			double n = scanner.nextDouble();
			valores[i] = n;
		}
		
		System.out.print("Soma dos 3 números: " + somar(valores[0], valores[1], valores[2]));
		
		scanner.close();
	}
	
	static double somar(double n1, double n2, double n3) {
		return n1 + n2 + n3;
	}

}
