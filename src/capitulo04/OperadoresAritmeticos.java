package capitulo04;

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		
		Integer adicao = 1 + 1;
		System.out.println("Adi��o: " + adicao);
		
		Integer subtracao = 1 - 1;
		System.out.println("Subtra��o: " + subtracao);
		
		Integer multiplicacao = 2 * 2;
		System.out.println("Multiplica��o: " + multiplicacao);
		
		Integer divisao = 4 / 2;
		System.out.println("Divisao: " + divisao);
		
		Integer modulo = 5 % 4;
		System.out.println("M�dulo: " + modulo);
		
		Integer precedencia01 = 1 + 1 * 5 / 5;
		System.out.println("Precedencia: " + precedencia01);
		
		Integer precedencia02 = (1 + 1) * 5 / 5;
		System.out.println("Precedencia02: " + precedencia02);
		
		Integer precedencia03 = 1 + (5 * 5) / 5;
		System.out.println("Precedencia03: " + precedencia03);
		
		Integer cinco = 5;
		Integer um = 1;
		
		Integer precedenciaComVariaveis = cinco * (um + um);
		System.out.println("Precedencia com vari�veis: " + precedenciaComVariaveis);
		
	}
}
