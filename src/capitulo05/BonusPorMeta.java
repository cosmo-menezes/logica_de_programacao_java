package capitulo05;

import java.util.Scanner;

public class BonusPorMeta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Double meta_anual_faturamento = 600000.0;
		Double faturamento_real = 500000.0;
		Double media_salarial = 3000.0;
		
		if (faturamento_real >= meta_anual_faturamento) {
			System.out.println("Os funcionarios receber�o um sal�rio como b�nus.");
		} else if (faturamento_real >= 480000.0) {
			System.out.println("Os funcionarios receber�o 80% do valor de seu sal�rio como b�nus por metas.");
		} else {
			System.out.println("N�o haver� bonus.");
		}
		
		
		
		sc.close();
	}

}
