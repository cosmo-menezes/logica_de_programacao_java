package capitulo04;
import java.util.Scanner;

public class ValorTotalDaCompra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto adquirido: ");
		int produto = sc.nextInt();
		int frete = 15;
		
		int total = produto + frete;
		
		
		
		System.out.println("O valor total de suas compras com o valor do FRETE é de: " + total);
		
		

	}

}
