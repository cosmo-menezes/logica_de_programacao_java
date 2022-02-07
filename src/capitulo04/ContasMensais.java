package capitulo04;
import java.util.Scanner;

public class ContasMensais {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da sua conta de luz: ");
		double conta_luz = sc.nextDouble();
		
		System.out.println("Digite o valor da sua conta de água: ");
		double conta_agua = sc.nextDouble();
		
		System.out.println("Digite o valor da sua conta de telefone: ");
		double conta_telefone = sc.nextDouble();
		
		System.out.println("Digite o valor da mensalidade da escola de seu filho: ");
		double mensalidade_escolar = sc.nextDouble();
		
		System.out.println("Digite o valor da fatura do cartão de crédito: ");
		double cartao_credito = sc.nextDouble();
		
		System.out.println("Digite o valor das compras no supermecado: ");
		double gastos_supermecado = sc.nextDouble();
		
		double gasto_mensal = conta_luz + conta_agua + conta_telefone + mensalidade_escolar + 
				cartao_credito + gastos_supermecado;
		
		System.out.println("O valor total de seus gasto mensal é de: " + gasto_mensal + " .");
		
	}
}
