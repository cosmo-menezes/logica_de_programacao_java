package capitulo04;

public class OperadoresLogicos {

	public static void main(String[] args) {
		Boolean carrinhoMaiorQue100 = true;
		Boolean periodoPromocao = true;
		Boolean valorMaiorQue100 = true;
		Boolean valorMenorQue100 = true;
		
		Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoPromocao;
		
		if(aplicarDesconto) {
			System.out.println("Sim!, aplique o desconto. ");
		} else {
			System.out.println("Não te desconto!");
		}
		
		Boolean desconto = valorMaiorQue100 || valorMenorQue100;
		
		if(desconto) {
			System.out.println("Valor com desconto!");
		} else {
			System.out.println("Valor sem desconto");
		}

	}

}
