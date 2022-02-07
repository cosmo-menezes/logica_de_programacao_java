package capitulo07;

import java.util.Scanner;

public class Vetores1Dimensao {

	public static void main(String[] args) {
		String[] cardapio = new String[] {"Calabresa", "Atum", "Queijo", "Presunto"};
		
		System.out.println("Escolha o sabor: ");
		
		for(int i = 0; i < cardapio.length; i++) {
			System.out.println("[" + i + "]" + cardapio[i]);
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número referente ao sabor da pizza ");
		Integer saborEscolhido = sc.nextInt();
		
		System.out.println("Voce escolheu o sabor: " + cardapio[saborEscolhido]);
		
		sc.close();
	}

}
