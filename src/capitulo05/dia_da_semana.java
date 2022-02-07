package capitulo05;

import java.util.Scanner;

public class dia_da_semana {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana: ");
		Integer dia_da_semana = sc.nextInt();
		
		switch(dia_da_semana) {
		case 1: 
			System.out.println("Domingo");
			break;
		case 2: 
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default: 
			System.err.print("Digite um número válido");
			System.exit(1);
		}

		
		sc.close();

	}

}
