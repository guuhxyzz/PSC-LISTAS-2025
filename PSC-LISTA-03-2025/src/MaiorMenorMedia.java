
import java.util.Scanner;

public class MaiorMenorMedia {
    public static void main(String[] args) {
        int n1, n2, n3;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            n1 = scanner.nextInt();
            System.out.print("Digite um número: ");
            n2 = scanner.nextInt();
            System.out.print("Digite um número: ");
            n3 = scanner.nextInt();
        }
        // 1.a
        if (n1 > n2 && n1 > n3){
            System.out.println("O maior número é: " + n1);
        } else if (n2 > n1 && n2 > n3){
            System.out.println("O maior número é: " + n2);
        } else {
            System.out.println("O maior número é: " + n3);
        }
        // 1.b
        if (n1 < n2 && n1 < n3){
            System.out.println("O menor número é: " + n1);
        } else if (n2 < n1 && n2 < n3){
            System.out.println("O menor número é: " + n2);
        } else {
            System.out.println("O menor número é: " + n3);
        }
        // 1.c
        double media = (n1 + n2 + n3) / 3;
        System.out.printf("Média dos 3 números: %.2f", media);
    }
}