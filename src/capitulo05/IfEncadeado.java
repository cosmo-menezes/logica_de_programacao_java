package capitulo05;

import java.util.Scanner;

public class IfEncadeado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o peso: ");
		Double peso = sc.nextDouble();
		
		Boolean pesoLeve = (peso <= 60) && (peso > 0);
		Boolean pesoMedio = (peso > 60) && (peso <= 90);
		Boolean pesoPesado = peso > 90;
		
		if(pesoLeve) {
			System.out.println("O lutador � peso leve");
		} else if (pesoMedio) {
			System.out.println("O lutador � peso m�dio");
		} else if (pesoPesado){
			System.out.println("O lutador � peso pesado");
		}else {
			System.out.println("O lutador n�o se encaixa em nenhuma das categorias");
		}
		
		sc.close();
	}

}
