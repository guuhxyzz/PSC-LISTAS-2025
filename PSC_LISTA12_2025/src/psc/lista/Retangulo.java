package psc.lista;

public class Retangulo {
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = Math.max(0, comprimento); 
        this.largura = Math.max(0, largura);       
    }

    public void mudarLados(double novoComprimento, double novaLargura) {
        if (novoComprimento >= 0 && novaLargura >= 0) {
            this.comprimento = novoComprimento;
            this.largura = novaLargura;
            System.out.println("Lados do retângulo alterados para: Comprimento=" + novoComprimento + ", Largura=" + novaLargura);
        } else {
            System.out.println("Erro: Os lados não podem ser negativos.");
        }
    }

    public double retornarComprimento() {
        return this.comprimento;
    }

    public double retornarLargura() {
        return this.largura;
    }

    public double calcularArea() {
        return this.comprimento * this.largura;
    }

    public double calcularPerimetro() {
        return 2 * (this.comprimento + this.largura);
    }
}