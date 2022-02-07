package capitulo07;

public class VetoresMaisDe2Dimensoes {

	public static void main(String[] args) {
		Double[] faturamentoJaneiro = new Double[] {1500.0, 2000.0, 1700.0};
		Double[] faturamentoFevereiro = new Double[] {1500.0, 2000.0, 1700.0};
		
		Double[][] faturamentoAnual = new Double[][] {faturamentoJaneiro, faturamentoFevereiro};
		
		Double [][][] faturamentoQuinquenal = new Double [][][] {faturamentoAnual};
		Double [][][][] faturamentoDaDecada = new Double [][][][] {faturamentoQuinquenal};

	}

}
