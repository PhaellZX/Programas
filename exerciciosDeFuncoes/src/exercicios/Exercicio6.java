package exercicios;

public class Exercicio6 {

	public static void inverteVet(int[] vetor) {

		int temp;	
	    
		for (int i = 0; i < vetor.length; i++) {
	            for (int j = 0; j < i; j++) {
	                temp = vetor[i];
	                vetor[i] = vetor[j];
	                vetor[j] = temp;
	                
	                System.out.println(temp);
	            }
	     }
	}
	
	public static void main(String[] args) {
		
		int[] vet = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		inverteVet(vet);

	}

}
