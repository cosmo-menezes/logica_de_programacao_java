package capitulo05;

import java.util.Scanner;

public class NotaDeConcursoPublico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua nota de portugues: ");
		int nota_de_portugues = sc.nextInt();
		
		System.out.println("Digite sua nota de matem�tica: ");
		int nota_de_matematica = sc.nextInt();
		
		if(nota_de_portugues >= 75 && nota_de_matematica >= 75) {
			System.out.println("Voc� est� aprovado");
			
		}else {
			System.out.println("Voc� est� reprovado");
		}

	}

}
