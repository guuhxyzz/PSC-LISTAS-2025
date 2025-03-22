
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        double a, b, c, delta, raiz;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o coeficiente a: ");
            a = scanner.nextDouble();
            System.out.print("Digite o coeficiente b: ");
            b = scanner.nextDouble();
            System.out.print("Digite o coeficiente c: ");
            c = scanner.nextDouble();
        }
        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } else if (a == 0 && b != 0) {
            raiz = -c / b;
            System.out.println("Essa é uma equação de primeiro grau.");
            System.out.printf("A raiz real é: %.2f\n", raiz);
        } else {
            delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais.");
            } else if (delta == 0) {
                raiz = -b / (2 * a);
                System.out.println("Esta equação possui duas raízes reais iguais.");
                System.out.printf("A raiz é: %.2f\n", raiz);
            } else {
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Esta equação possui duas raízes reais diferentes.");
                System.out.printf("Raiz 1: %.2f\n", raiz1);
                System.out.printf("Raiz 2: %.2f\n", raiz2);
            }
        }
    }
}