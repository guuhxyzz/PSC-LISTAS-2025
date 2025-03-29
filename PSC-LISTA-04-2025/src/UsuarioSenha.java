
import java.util.Scanner;

public class UsuarioSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Escolha seu nome de usuario: ");
            String user = scanner.next();
            System.out.println("Agora escolha sua senha: ");
            String senha = scanner.next();
            if (senha.equalsIgnoreCase(user) || senha.length() < 8){
                System.out.println("A senha não pode ser igual ao nome de usuario e deve ter 8 caracteres");
            } else {
                System.out.println("User: " + user + "\nSenha: " + senha);
                break;
            }
        }
        scanner.close();
    }
}
