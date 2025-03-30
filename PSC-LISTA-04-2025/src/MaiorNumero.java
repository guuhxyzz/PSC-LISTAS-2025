
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < numeros.length; i++){
                System.out.print("Digte um número aleatorio: ");
                numeros[i] = scanner.nextInt();
            }
        }

        List<Integer> listaNumeros = Arrays.stream(numeros).boxed().toList();
        int maiorNumero = Collections.max(listaNumeros);
        System.out.println("O maior número digitado foi: " + maiorNumero);
    }
}
