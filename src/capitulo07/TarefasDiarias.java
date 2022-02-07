package capitulo07;

import java.util.Scanner;

public class TarefasDiarias {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] tarefas = new String[5];
		
		for(int i = 0; i < tarefas.length; i++) {
			System.out.println("Digite suas tarefas: ");
			tarefas[i] = sc.next();
		}
		
		System.out.println("Suas tarefas são: ");
		for(int i = 0; i < tarefas.length; i++) {
			System.out.println(i + ": " + tarefas[i]);
		}
		
		sc.close();

	}

}
