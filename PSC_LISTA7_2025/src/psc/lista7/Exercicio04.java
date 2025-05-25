package psc.lista7;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
  
        int[] contadoresFaixas = new int[9];


        Scanner entrada = new Scanner(System.in);

        System.out.println("Programa para calcular salários de vendedores e contá-los por faixa.");
        System.out.println("Digite as vendas brutas de cada vendedor. Digite -1 para encerrar.");

        while (true) { 
            System.out.print("Vendas brutas do vendedor (ou -1 para sair): $");
            double vendasBrutas = 0; 

            try {
                vendasBrutas = entrada.nextDouble();

                if (vendasBrutas == -1) {
                    break; 
                }

                if (vendasBrutas < 0) {
                    System.out.println("As vendas brutas não podem ser negativas. Por favor, tente novamente.");
                    continue;
                }

                double salario = 200 + (0.09 * vendasBrutas);

                int indiceFaixa = (int) (salario / 100);
                
                if (indiceFaixa >= 2 && indiceFaixa <= 9) { 
                    if (indiceFaixa == 10) { 
                        contadoresFaixas[8]++; 
                    } else {
                        contadoresFaixas[indiceFaixa - 2]++;
                    }
                } else if (salario >= 1000) { 
                    contadoresFaixas[8]++; 
                }


            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número para as vendas brutas.");
                entrada.next(); 
            }
        }

        System.out.println("\n--- Relatório de Salários por Faixa ---");
        System.out.println("$200 - $299: " + contadoresFaixas[0] + " vendedores");
        System.out.println("$300 - $399: " + contadoresFaixas[1] + " vendedores");
        System.out.println("$400 - $499: " + contadoresFaixas[2] + " vendedores");
        System.out.println("$500 - $599: " + contadoresFaixas[3] + " vendedores");
        System.out.println("$600 - $699: " + contadoresFaixas[4] + " vendedores");
        System.out.println("$700 - $799: " + contadoresFaixas[5] + " vendedores");
        System.out.println("$800 - $899: " + contadoresFaixas[6] + " vendedores");
        System.out.println("$900 - $999: " + contadoresFaixas[7] + " vendedores");
        System.out.println("$1000 em diante: " + contadoresFaixas[8] + " vendedores");

        entrada.close();
    }
}