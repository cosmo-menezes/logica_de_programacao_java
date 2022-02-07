package capitulo06;

public class IteracaoComWhile {

	public static void main(String[] args) {
		
		int i = 0;
		while (i < 10) {
			if (i == 5) {
				System.out.println("Vai parar!");
				break;
			}
			System.out.println(i + " : Frase qualquer!");
			i++;
		}

	}

}
