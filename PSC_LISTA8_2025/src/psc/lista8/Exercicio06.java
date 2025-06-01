package psc.lista8;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("==== Conversor de Horas 24h para 12h ====");
		
		do {
			int horas = -1;
			int minutos = -1;
			
			while (horas < 0 || horas > 23) {
                System.out.print("Digite as horas (0-23): ");
                try {
                    horas = scanner.nextInt();
                    if (horas < 0 || horas > 23) {
                        System.out.println("Hora inválida. Por favor, digite um valor entre 0 e 23.");
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, digite um número inteiro para as horas.");
                    scanner.next();
                }
            }
			
			while (minutos < 0 || minutos > 59) {
                System.out.print("Digite os minutos (0-59): ");
                try {
                    minutos = scanner.nextInt();
                    if (minutos < 0 || minutos > 59) {
                        System.out.println("Minutos inválidos. Por favor, digite um valor entre 0 e 59.");
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, digite um número inteiro para os minutos.");
                    scanner.next();
                }
            }
			
			char[] amPm = new char[1];
			
			int horas12h = convesor12h(horas, amPm);
			
			exibirHora12h(horas12h, minutos, amPm);
			
			System.out.println("Deseja fazer outra conversão? [s/n]");
			String continuar = scanner.next();
			if (continuar.equalsIgnoreCase("n")) break;
		} while (true);
		
		System.out.println("Programa encerrado.");
        scanner.close(); 
		
	}
	
	static int convesor12h(int hora24h, char[] amPm) {
		
		int hora12h;
		
		if (hora24h >= 0 && hora24h < 12) {
			amPm[0] = 'A';
			if (hora24h == 0) hora12h = 12;
			else hora12h = hora24h;
		} else {
			amPm[0] = 'P';
			if (hora24h == 12) hora12h = 12;
			else hora12h = hora24h - 12;
		}
		
		return hora12h;
	}
	
	static void exibirHora12h(int hora12h, int minutos, char[] amPm) {
        System.out.println(String.format("Hora convertida: %d:%02d %c.M.", hora12h, minutos, amPm[0]));
    }

}
