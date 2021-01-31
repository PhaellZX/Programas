package exercicios;

public class Exercicio7 {
	
	public static void ordenaVet(int[] vet) {
		
		int aux = 0;
		
		 for (int i = 0; i < vet.length; i++) {
             for (int j = 0; j < vet.length; j++){
                 if (vet[i] < vet[j]){
                	 
                     aux = vet[i];
                     vet[i] = vet[j];
                     vet[j] = aux;
                 }
             }
         }
		 
		 for (int k = 0; k < vet.length; k++){
             System.out.println(vet[k]);
         }
		
	}

	public static void main(String[] args) {
		
		 int [] vetor = { 9, 5, 7, 2, 1, 3 };
		 
		 ordenaVet(vetor);
	}

}
