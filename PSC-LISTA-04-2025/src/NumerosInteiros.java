import java.util.Scanner;

public class NumerosInteiros {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número inteiro: ");
            int numero1 = scanner.nextInt();
            System.out.print("Digite o segundo número inteiro: ");
            int numero2 = scanner.nextInt();

            System.out.println("Números no intervalo compreendido entre " + numero1 + " e " + numero2 + ":");

            int menor = Math.min(numero1, numero2);
            int maior = Math.max(numero1, numero2);

            for (int i = menor + 1; i < maior; i++) {
                System.out.println(i);
            }
        }
    }
}
