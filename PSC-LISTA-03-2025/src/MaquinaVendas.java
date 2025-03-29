import java.util.Scanner;

public class MaquinaVendas {
    public static void main(String[] args) {
        String maisProduto;
        int nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0, nota1 = 0;
        double valorTotal = 0, troco, valorPago;
        double precoCoca = 4.00, precoAgua = 2.00, precoBiscoito = 6.00, precoSalgado = 10.00, precoChocolate = 8.00;
        try (Scanner scanner = new Scanner(System.in)) {
            while (true){
                System.out.println("""
                    === Máquina de vendas ===
                    1 - CocaCola R$4,00
                    2 - Água R$2,00
                    3 - Biscoito R$6,00
                    4 - Salgado R$10,00
                    5 - Chocolate R$8,00
                """);
                System.out.println("O que você gostaria de pedir levar hoje? (Digite o número do produto)");
                int carrinho = scanner.nextInt();
                scanner.nextLine();

                switch (carrinho) {
                    case 1 -> valorTotal += precoCoca;
                    case 2 -> valorTotal += precoAgua;
                    case 3 -> valorTotal += precoBiscoito;
                    case 4 -> valorTotal += precoSalgado;
                    case 5 -> valorTotal += precoChocolate;
                    default -> System.out.println("Produto não encontrado");
                }

                while (true){
                    System.out.println("Vai levar mais algum produto? [S/N]");
                    maisProduto = scanner.nextLine().toUpperCase();
                    if (maisProduto.equals("N")){
                        break;
                    } else if (!maisProduto.equals("S")){
                        System.out.println("Resposta inválida! Por favor, digite 'S' para sim ou 'N' para não.");
                    } else {
                        break;
                    }
                }
                if (maisProduto.equals("N")){
                    break;
                }
            }
            System.out.printf("\nSua compra deu: %.2f", valorTotal);
            while (true){
                System.out.println("\nQuanto você irá pagar? ");
                valorPago = scanner.nextInt();
                if (valorPago < valorTotal){
                    System.out.println("Esse valor é insuficiente.");
                } else {
                    break;
                }
            }
        }

        troco = valorPago - valorTotal;
        System.out.printf("\nValor pago: R$%.2f", valorPago);
        System.out.printf("\nValor da compra: R$%.2f", valorTotal);
        System.out.printf("\nTroco: R$%.2f", troco);

        while (troco >= 50){
            nota50 += 1;
            troco -= 50;
        }
        while (troco >= 20){
            nota20 += 1;
            troco -= 20;
        }
        while (troco >= 10){
            nota10 += 1;
            troco -= 10;
        }
        while (troco >= 5){
            nota5 += 1;
            troco -= 5;
        }
        while (troco >= 2){
            nota2 += 1;
            troco -= 2;
        }
        while (troco >= 1){
            nota1 += 1;
            troco -= 1;
        }

        System.out.println(
            "\nNotas de R$ 50,00: " + nota50
            + "\nNotas de R$ 20,00: " + nota20
            + "\nNotas de R$ 10,00: " + nota10
            + "\nNotas de R$ 5,00: " + nota5
            + "\nNotas de R$ 2,00: " + nota2
            + "\nNotas de R$ 1,00: " + nota1
        );
    }
}