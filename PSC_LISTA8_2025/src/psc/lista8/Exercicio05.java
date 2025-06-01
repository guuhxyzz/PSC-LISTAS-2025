package psc.lista8;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		double taxa = 0;
        try {
        	System.out.print("Digite a taxa de imposto sobre vendas (em porcentagem, ex: 5 para 5%): ");
        	taxa = scanner.nextDouble();
        	
            if (taxa < 0) {
                System.out.println("A taxa de imposto não pode ser negativa. Usando 0% por padrão.");
                taxa = 0;
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida para a taxa de imposto. Usando 0% por padrão.");
            scanner.next(); 
        }
        
        double custoOriginal = 0;
        try {
        	System.out.print("Digite o custo do item antes do imposto: ");
            custoOriginal = scanner.nextDouble();
            
            if (custoOriginal < 0) {
                System.out.println("O custo não pode ser negativo. Usando 0.0 por padrão.");
                custoOriginal = 0;
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Entrada inválida para o custo. Usando 0.0 por padrão.");
            scanner.next(); 
        }
        
        double custoComImposto = somaImposto(taxa, custoOriginal);
        
        System.out.println(String.format("Taxa de imposto: %.2f%%", taxa));
        System.out.println(String.format("Custo com imposto: R$ %.2f", custoComImposto));

        scanner.close();
	}
	
	static double somaImposto(double taxaImposto, double custo) {
		return custo * (1 + (taxaImposto / 100));
	}

}
