package psc.lista;

public class Pessoa {
    private String nome;
    private int idade; 
    private double peso; 
    private double altura; 

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = Math.max(0, idade);
        this.peso = Math.max(0, peso);
        this.altura = Math.max(0, altura);
    }

    public void envelhecer(int anos) {
        if (anos > 0) {
            for (int i = 0; i < anos; i++) {
                this.idade++;
                if (this.idade < 21) {
                    this.crescer(0.5); 
                }
            }
            System.out.println(this.nome + " envelheceu " + anos + " ano(s). Idade atual: " + this.idade);
        } else {
            System.out.println("O número de anos para envelhecer deve ser positivo.");
        }
    }

    public void engordar(double quilos) {
        if (quilos > 0) {
            this.peso += quilos;
            System.out.println(this.nome + " engordou " + quilos + " kg. Peso atual: " + String.format("%.2f", this.peso) + " kg.");
        } else {
            System.out.println("O peso a engordar deve ser positivo.");
        }
    }

    public void emagrecer(double quilos) {
        if (quilos > 0) {
            if (this.peso - quilos >= 0) { 
                this.peso -= quilos;
                System.out.println(this.nome + " emagreceu " + quilos + " kg. Peso atual: " + String.format("%.2f", this.peso) + " kg.");
            } else {
                this.peso = 0; 
                System.out.println(this.nome + " emagreceu " + quilos + " kg, mas o peso não pode ser negativo. Peso atual: vento leva (0kg).");
            }
        } else {
            System.out.println("O peso a emagrecer deve ser positivo.");
        }
    }

    public void crescer(double cm) {
        if (cm > 0) {
            this.altura += cm;
            System.out.println(this.nome + " cresceu " + String.format("%.1f", cm) + " cm. Altura atual: " + String.format("%.2f", this.altura) + " cm.");
        } else {
            System.out.println("O crescimento deve ser positivo.");
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
}