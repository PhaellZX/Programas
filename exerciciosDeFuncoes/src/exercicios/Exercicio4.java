package exercicios;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void leVet(int vetor[]) {
		
		for(int numeros:vetor) {
			
		System.out.println(numeros);	
			
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int tam, num;
		
		System.out.println("Digite o tamanho do vetor");
		tam = entrada.nextInt();
		
		int vet[] = new int[tam];
		
		for(int i = 0; i < vet.length; i++) {
		
			System.out.println("Digite um valor: ");
		    num = entrada.nextInt();
		    
		    vet[i] = num;
		
		}
		
		leVet(vet);
	}
}
