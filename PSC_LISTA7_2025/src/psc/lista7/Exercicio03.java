package psc.lista7;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> num = new ArrayList<>();
		
		while(true) {
			System.out.println("Digite um valor: [-1 para encerrar o programa]");
			double resp = scanner.nextDouble();
			if(resp == -1) break;
			if(resp < -1) {
				System.out.println("Digite valores maiores que 0"); 
				continue;
				}
			num.add(resp);
		}
		
		System.out.println("Quantidade de números que foram lidos: " + num.size());
		
		for (double i : num) {
            System.out.print(i + " ");
        }
		
		System.out.println("\nValores na ordem inversa:");
        for (int i = num.size() - 1; i >= 0; i--) {
            System.out.println(num.get(i));
        }
        
        double soma = 0;
        for (double i : num) {
            soma += i;
        }
        System.out.println("Soma dos valores: " + soma);
        
        double media = soma / num.size();
        System.out.printf("Média dos valores: %.2f ", media);
        
        int acimaMedia = 0;
        for (double i : num) {
            if (i > media) acimaMedia++;
        }
        System.out.println("\nQuantidade de valores acima da média: " + acimaMedia);
        
        int abaixoSete = 0;
        for (double i : num) {
            if (i < 7) abaixoSete++;
        }
        System.out.println("Quantidade de valores abaixo de sete: " + abaixoSete);
        
        System.out.println("\nPrograma encerrado. Obrigado!");
		
		scanner.close();
	}

}
