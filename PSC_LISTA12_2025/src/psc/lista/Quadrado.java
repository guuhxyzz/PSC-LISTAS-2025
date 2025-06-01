package psc.lista;

public class Quadrado {
	
    private double tamanhoLado; 

    public Quadrado(double tamanhoLado) {
        this.tamanhoLado = Math.max(0, tamanhoLado);
    }

    public void mudarValorLado(double novoLado) {
        if (novoLado >= 0) {
            this.tamanhoLado = novoLado;
            System.out.println("Lado do quadrado alterado para: " + this.tamanhoLado);
        } else {
            System.out.println("Erro: O lado não pode ser negativo.");
        }
    }

    public double retornarValorLado() {
        return this.tamanhoLado;
    }

    public double calcularArea() {
        return this.tamanhoLado * this.tamanhoLado;
    }
}