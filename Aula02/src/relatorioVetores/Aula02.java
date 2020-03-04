package relatorioVetores;

import java.util.Scanner;

public class Aula02 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		// Declaração
		float notas[];
		
		System.out.println("Quantas notas serão digitadas?");
		int qtdAlunos = in.nextInt();
		
		notas = new float[qtdAlunos];
		float soma = 0;
		// ler cada uma das notas
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a nota d@ alun@: " + ( i + 1 ) + " : ");
			notas[i] = in.nextFloat();
		}
		
		// NOTAS
		
		System.out.println("Valor das notas");
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
			soma = soma + notas[i];
		}
		
		// Maior nota
		
		float maior = notas[0], menor = notas[0];
		
		for (int i = 0; i < notas.length; i++) {
			if(notas[i] > maior) {
				maior = notas[i];
				System.out.println("Maior nota: " + notas[i]);
			}
		}
		
		// Menor nota
		
		for (int i = 0; i < notas.length; i++) {
			if(notas[i] < menor) {
				menor = notas[i];
				System.out.println("Menor nota: " + notas[i]);
			}
		}
		
		// Reprovados
		
		int reprovados = 0;
		
		for (int i = 0; i < notas.length; i++) {
			if(notas[i] < 7) {
				reprovados++;
			}
		}
		
		System.out.println("REPROVADOS: " + reprovados);
		
		// Alunos nota 10
		
		int notas10 = 0;
		
		for (int i = 0; i < notas.length; i++) {
			if(notas[i]==10) {
				notas10++;
			}
		}
		
		System.out.println("n° de notas 10: " + notas10);
		
		// Media das notas
		
		float media = soma / notas.length;
		
		System.out.println("A media das notas: " + media);
		
		
	}	
}
