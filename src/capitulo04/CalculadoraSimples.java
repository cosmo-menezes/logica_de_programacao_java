package capitulo04;
import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o primeiro numero: ");
		int n1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int n2 = sc.nextInt();
		

		int soma = n1 + n2;
		int sub = n1 - n2;
		int divisao = n1 / n2;
		int produto = n1 * n2;
		

		System.out.println("Resultado soma: " + soma +
				"\nResultado subtração: " + sub + 
				"\nResultado divisão: " + divisao + 
				"\nResultado produto: " + produto);
		
	}

}
