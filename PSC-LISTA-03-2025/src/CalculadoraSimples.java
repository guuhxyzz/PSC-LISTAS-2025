import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        double n1, n2, opcao;
        int operacao;

        try (Scanner scanner = new Scanner(System.in)) {
            while (true){
                System.out.println("\n1 - Para fazer uma operação, 2 - para fechar o programa");
                opcao = scanner.nextInt();
                if (opcao == 2){
                    break;
                } else if (opcao != 1){
                    System.out.println("Opção inválida");
                } else {
                    System.out.print("Digite o primeiro número: ");
                    n1 = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    n2 = scanner.nextInt();

                    System.out.println("""
                        1 - Operação +
                        2 - Operação - 
                        3 - Operação *
                        4 - Operação /
                        5 - Operação ^    
                        """);
                    operacao = scanner.nextInt();
                    
                    switch (operacao) {
                        case 1 -> System.out.printf("%.2f + %.2f = %.2f", n1, n2, n1 + n2);
                        case 2 -> System.out.printf("%.2f - %.2f = %.2f", n1, n2, n1 - n2);
                        case 3 -> System.out.printf("%.2f * %.2f = %.2f", n1, n2, n1 * n2);
                        case 4 -> {
                            if (n2 == 0){
                                System.out.println("Não é possível dividir por 0");
                                continue;
                            } else {
                                System.out.printf("%.2f / %.2f = %.2f", n1, n2, n1 / n2);
                        }
                        }
                        case 5 -> System.out.printf("%.2f ^ %.2f = %.2f", n1, n2, Math.pow(n1, n2));
                        default -> System.out.println("Operação inválida");
                    }
                }
            }
        }
    }
}