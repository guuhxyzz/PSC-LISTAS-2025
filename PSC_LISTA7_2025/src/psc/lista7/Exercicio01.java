package psc.lista7;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		ArrayList<Double> temp = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < meses.length; i++) {
			
			System.out.println("Digite a temperatura média do mês " + meses[i] + ": ");
			double tempAdd = scanner.nextDouble();
			temp.add(tempAdd);
		}
		scanner.close();
		
		double media = mediaAnual(temp.get(0), temp.get(1), temp.get(2), temp.get(3), temp.get(4), temp.get(5), temp.get(6), temp.get(7), temp.get(8), temp.get(9), temp.get(10), temp.get(11));
		System.out.printf("\nTemperatura média anual: %.2f°C\n", media);

        System.out.println("\nMeses com temperatura acima da média anual:");
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i) > media) {
                System.out.printf("%d - %s: %.2f°C\n", i + 1, meses[i], temp.get(i));
            }
        }
	}
	
	public static double mediaAnual(double jan, double fev, double mar, double abr, double mai, double jun, double jul, double ago, double set, double out, double nov, double dez) {
		double media = (jan + fev + mar + abr + mai + jun + jul + ago + set + out + nov + dez) / 12;
		return media;
	}

}
