
import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) { 
                System.out.println("Digite a nota do aluno: 0 - 10");
                double nota = scanner.nextDouble();
                if (nota < 0 || nota > 10){
                    System.out.println("Nota inválida");
                } else {
                    System.out.println("Nota: " + nota);
                    break;
                }   
            }
        } 
    }
}
