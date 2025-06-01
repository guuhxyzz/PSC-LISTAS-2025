package psc.lista;

public class ContaCorrente {
	private String numeroConta;
    private String nomeCorrentista;
    private double saldo;
    
    public ContaCorrente(String numeroConta, String nomeCorrentista, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = Math.max(0, saldoInicial);
        System.out.println("Conta Corrente " + this.numeroConta + " criada para " + this.nomeCorrentista + " com saldo inicial de R$ " + String.format("%.2f", this.saldo) + ".");
    }

    public void alterarNome(String novoNome) {
        if (novoNome != null && !novoNome.trim().isEmpty()) {
            this.nomeCorrentista = novoNome;
            System.out.println("Nome do correntista alterado para: " + this.nomeCorrentista);
        } else {
            System.out.println("Erro: Nome inválido para o correntista.");
        }
    }

    public void deposito(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println(String.format("Depósito de R$ %.2f realizado com sucesso. Novo saldo: R$ %.2f", valor, this.saldo));
        } else {
            System.out.println("Valor para depósito deve ser positivo.");
        }
    }

    public void saque(double valor) {
        if (valor <= 0) {
            System.out.println("Valor para saque deve ser positivo.");
            return;
        }
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println(String.format("Saque de R$ %.2f realizado com sucesso. Novo saldo: R$ %.2f", valor, this.saldo));
        } else {
            System.out.println(String.format("Saldo insuficiente para realizar a operação. Saldo atual: R$ %.2f", this.saldo));
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }
}
