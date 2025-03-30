
import java.util.InputMismatchException;
import java.util.Scanner;

public class CrescimentoPopulacional_2 {
    public static void main(String[] args) {
        double populacaoA = 0, taxaA = 0; 
        double populacaoB = 0, taxaB = 0; 
        int anos = 0;

        System.out.println("""
                ==========
                Crescimento Populacional 

                Vamos calcular quantos anos são necessário
                para o país A ultrapasse a população do país B
                ==========
                """);

        Scanner scanner = new Scanner(System.in); 
        while (true) {
            try {
                System.out.println("Digite a população do país A:");
                populacaoA = scanner.nextDouble();
                System.out.println("Digite a população do país B:");
                populacaoB = scanner.nextDouble();

                if (populacaoA > 0 && populacaoB > 0 && populacaoA < populacaoB) {
                    break;
                } else {
                    System.out.println("As populações devem ser maiores que zero. Tente novamente.\nE a população do país A deve ser menor que a do país B");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Você deve digitar um número válido. Tente novamente.");
                scanner.nextLine(); 
            }
        }
        while (true) {
            try {
                System.out.println("Digite a taxa anual de crescimento do país A: (em %)");
                taxaA = scanner.nextDouble();
                System.out.println("Digite a taxa anual de crescimento do país B: (em %)");
                taxaB = scanner.nextDouble();
                
                if (taxaA > 0 && taxaB > 0){
                    break;
                } else {
                    System.out.println("As taxas devem ser maiores que zero.");
                }
            } catch (InputMismatchException e){
                System.out.println("Erro: Você deve digitar um número válido. Tente novamente.");
                scanner.nextLine();
            }
        }
        while (populacaoA < populacaoB) {
            populacaoA += populacaoA * (taxaA / 100); 
            populacaoB += populacaoB * (taxaB / 100);
            anos++;
        }
        System.out.println("Serão necessários " + anos + " anos para que a população do país A ultrapasse ou iguale a do país B.");
        scanner.close();
    }
}
