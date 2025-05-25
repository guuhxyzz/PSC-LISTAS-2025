package psc.lista7;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] perguntas = {"Telefonou para a vítima? [S/N]",
				"Esteve no local do crime? [S/N]",
				"Mora perto da vítima? [S/N]",
				"Devia para a vítima? [S/N]",
				"Já trabalhou com a vítima? [S/N]"};
		String[] respostas = new String[perguntas.length];
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < perguntas.length; i++) {
			System.out.println(perguntas[i]);
			String resposta = scanner.next();
			respostas[i] = resposta;
		}
		
		int totalS = 0;
		
		for (String resposta : respostas) {
		    if (resposta.equalsIgnoreCase("S")) {
		        totalS++;
		    }
		}
		
		if(totalS == 5) {
			System.out.println("Assassino");
		} else if(totalS == 4 || totalS == 3) {
			System.out.println("Cúmplice");
		} else if(totalS == 2) {
			System.out.println("Suspeita");
		} else {
			System.out.println("Inocente");
		}
		scanner.close();
	}
}