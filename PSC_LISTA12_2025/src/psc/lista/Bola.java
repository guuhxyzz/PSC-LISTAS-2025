package psc.lista;

public class Bola {
    private String cor;
    private double circunferencia;
    private String material;

    public Bola(String cor, double circunferencia, String material) {
        this.cor = cor;
        this.circunferencia = circunferencia;
        this.material = material;
    }

    public void trocarCor(String novaCor) {
        this.cor = novaCor;
        System.out.println("A cor da bola foi alterada para: " + this.cor);
    }

    public String mostraCor() {
        return this.cor;
    }

    public double getCircunferencia() {
        return circunferencia;
    }

    public String getMaterial() {
        return material;
    }
}