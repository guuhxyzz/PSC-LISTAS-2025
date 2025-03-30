public class CrescimentoPopulacional {
    public static void main(String[] args) {
        double populacaoA = 80000, taxaA = 1.03; 
        double populacaoB = 200000, taxaB = 1.015; 
        int anos = 0;
        while (populacaoA < populacaoB) {
            populacaoA *= taxaA;
            populacaoB *= taxaB;
            anos++;
        }
        System.out.println("Serão necessários " + anos + " anos para que a população do país A ultrapasse ou iguale a do país B.");
    }
}
