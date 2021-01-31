package exercicios;

public class Exercicio3 {

	public static void printVet(int vetor[]) {
		
		for(int num:vetor) {
			System.out.println(num);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		int vet[] = new int[6];
		
		for(int i = 1; i <= 5; i++) {
			vet[i] = vet[i] + i;
		}
		
		printVet(vet);
		
	}

}
