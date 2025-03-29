
import java.util.Scanner;

public class DadosPessoais {
    public static void main(String[] args) {
        String nome, sexo, estadoCivil;
        int idade;
        double salario;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Digite seu nome: ");
            nome = scanner.next();
            if (nome.length() <= 3){
                System.out.println("O nome deve ter mais que 3 caracteres.");
                continue;
            }
            System.out.print("Digite sua idade: ");
            idade = scanner.nextInt();
            if (idade < 0 || idade > 150){
                System.out.println("A sua idade deve ser entre 0 a 150");
                continue;
            }
            System.out.print("Digte seu sálario: ");
            salario = scanner.nextDouble();
            if (salario < 0){
                System.out.println("O sálario deve ser maior que 0");
                continue;
            }
            System.out.print("Digite seu sexo: F - Femenino M - Masculino ");
            sexo = scanner.next();
            if (!sexo.equalsIgnoreCase("F") && !sexo.equalsIgnoreCase("M")){
                System.out.println("Digite apenas F ou M");
                continue;
            }
            System.out.print("Digite seu estado civil: S - Solteiro C - Casado V - Viúvo(a) D - Divorciado ");
            estadoCivil = scanner.next();
            if (!estadoCivil.equalsIgnoreCase("S") && !estadoCivil.equalsIgnoreCase("C") && !estadoCivil.equalsIgnoreCase("V") && !estadoCivil.equalsIgnoreCase("D")){
                System.out.println("Digite apenas S, C, V ou D");
                continue;
            } 
            System.out.println("""
                    \n=====================
                    Nome: %s
                    Idade: %d   
                    Salário: %.2f
                    Sexo: %s
                    Estado Civil: %s
                    =====================
                    """.formatted(nome, idade, salario, sexo, estadoCivil));
            break;
        }
        scanner.close();
    }
}