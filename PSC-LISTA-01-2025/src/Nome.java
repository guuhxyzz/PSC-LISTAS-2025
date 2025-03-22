import java.util.Scanner;

public class Nome {
    public static void main(String[] args) {
        String nome;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            nome = scanner.nextLine();
        }
        System.out.print("Seu nome é: " + nome);
    }
}
