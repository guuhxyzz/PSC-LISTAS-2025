
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        int n1, n2, maiorN, menorN, nSorteado;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número: ");
            n1 = scanner.nextInt();
            System.out.print("Digite o segundo número: ");
            n2 = scanner.nextInt();
        }
        
        maiorN = Math.max(n1, n2);
        menorN = Math.min(n1, n2);
        nSorteado = (int) (Math.random() * (maiorN - menorN + 1)) + menorN;
        if (nSorteado % 2 == 0){
            System.out.println("O número sorteado é par: " + nSorteado);
        } else {
            System.out.println("O número sorteado é ímpar: " + nSorteado);
        }
    }
}