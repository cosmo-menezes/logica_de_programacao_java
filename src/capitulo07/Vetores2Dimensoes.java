package capitulo07;

public class Vetores2Dimensoes {

	public static void main(String[] args) {
		Double faturamentoDia = 1000.0;
		
		Double[] faturamentoJaneiro = new Double[] {1500.0, 2000.0, 1700.0};
		Double[] faturamentoFevereiro = new Double[] {1500.0, 2000.0, 1700.0};
		
		Double[][] faturamentoAnual = new Double[][] {faturamentoJaneiro, faturamentoFevereiro};
		
		//System.out.println("faturamento do dia 1o. de Janeiro " + faturamentoAnual[0][2]);
		//System.out.println("faturamento do dia 1o. de Fevereiro " + faturamentoAnual[1][2]);
		
		for(int i = 0; i < faturamentoAnual.length; i++) {
			System.out.println("Mês: " + (i + 1));
			
			Double[] mes = faturamentoAnual[i];
			
			for(int y = 0; y < mes.length; y++) {
				Double dia = mes[y];
				System.out.println("Dia " + y + ": " + dia);
			}
		}

	}

}
