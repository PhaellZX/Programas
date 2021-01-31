package exercicios;

import java.util.Scanner;

public class Exercicio5 {
	
	public static int maiorVet(int[] vetor) {
		
		int maior = Integer.MIN_VALUE;
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] > maior) {
				maior = vetor[i];
			}		
		}
		
		return maior;
	}
	
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		
		int num;
		int vet[] =  new int[5];
		
		for(int i = 0; i < vet.length; i++) {
		
			System.out.println("Digite um número");
			num = entrada.nextInt();
			
			vet[i] = num;
		}
		
		
		System.out.println(maiorVet(vet));
		
	}
}
