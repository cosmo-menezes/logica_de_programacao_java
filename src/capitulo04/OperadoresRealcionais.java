package capitulo04;

public class OperadoresRealcionais {

	public static void main(String[] args) {
		Boolean tresMaiorQueDois = 3 > 2;
		System.out.println("3 > 2 ? " + tresMaiorQueDois);
		
		Boolean tresMenorQueDois = 3 < 2;
		System.out.println("3 < 2 ? " + tresMenorQueDois);
		
		Boolean tresMaiorQueTres = 3 > 3;
		System.out.println("3 > 2 ? " + tresMaiorQueTres);
		
		Boolean tresMaiorOuIgualTres = 3 >= 2;
		System.out.println("3 > 3 ? " + tresMaiorOuIgualTres);
		
		Boolean tresMenorOuIgualTres = 3 >= 2;
		System.out.println("3 <= 3 ? " + tresMenorOuIgualTres);
		
		Boolean doisIgualADois = 2 == 2;
		System.out.println("2 == 2 ? " + doisIgualADois);

		Boolean doisDiferenteDeDois = 2 != 2;
		System.out.println("2 != 2 ? " + doisDiferenteDeDois);
		
		Integer quatro = 4;
		Boolean quatroMaiorQueQuatro = quatro > quatro;
		System.out.println("quatro > quatro? " + quatroMaiorQueQuatro);
		
		Integer cinco = 5;
		Boolean cincoIgualACinco = cinco.equals(cinco);
		System.out.println("cinco.equals(cinco)? " + cincoIgualACinco);
	}

}
