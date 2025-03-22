import java.util.Scanner;

public class Dados {
    public static void main(String[] args) {
        String nome;
        int idade;
        double altura;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            nome = scanner.nextLine();
            System.out.print("Agora sua idade: ");
            idade = scanner.nextInt();
            System.out.print("Agora sua altura: ");
            altura = scanner.nextDouble();
        }
        System.out.print("\nSeu nome é: " + nome);
        System.out.print("\nSeu idade é: " + idade);
        System.out.print("\nSeu altura é: " + altura);
    }
}
