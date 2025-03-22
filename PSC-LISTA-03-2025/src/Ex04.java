import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        int operacao;
        double raio, perimetro, area;
        double pi = 3.141592;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o código da operação (1 - Perímetro, 2 - Área, 3 - Volume): ");
            operacao = scanner.nextInt();

            System.out.print("Digite o raio: ");
            raio = scanner.nextDouble();

            switch (operacao) {
                case 1 -> {
                    perimetro = 2 * pi * raio;
                    System.out.printf("O perímetro do círculo é: %.2f\n", perimetro);
                    break;
                }
                case 2 -> {
                    area = pi * Math.pow(raio, 2);
                    System.out.printf("A área do círculo é: %.2f\n", area);
                    break;
                }
                case 3 -> {
                    double volume = (4.0 / 3.0) * pi * Math.pow(raio, 3); 
                    System.out.printf("O volume da esfera é: %.2f\n", volume);
                    break;
                }
                default -> 
                    System.out.println("Código de operação inválido!");
            }
        }
    }
}
