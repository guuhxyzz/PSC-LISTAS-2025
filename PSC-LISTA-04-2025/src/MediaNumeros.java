
import java.util.Scanner;

public class MediaNumeros {
    public static void main(String[] args) {
        int soma = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < 5; i++){
                System.out.print("Digite um número aleatorio: ");
                soma += scanner.nextInt();
            }
        }
        System.out.println("A média dos 5 números é: " + soma / 5);
    }
}
