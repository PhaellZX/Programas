package classes;
import java.util.ArrayList;

public class TesteLista {
	
	public static void main(String args[]) {
	
		ArrayList<Integer> numeros = new ArrayList<Integer>();
	
			// ADICIONAR
		
			numeros.add(10);
			numeros.add(20);
			numeros.add(30);
			numeros.add(40);
			numeros.add(50);
			numeros.add(60);
						
			// ESCOLHER A POSIÇÃO PARA ADCIONAR add(posição , adicionando elemento)
			
			numeros.add(2,100);
			
			// REMOVE ELEMENTO DA LISTA remove(posição)
			
			numeros.remove(0);
			
			// RETORNA O TAMANHO ATUAL DA LISTA get()
			
			    for (int i = 0; i < numeros.size(); i++) {
			 
			    	System.out.println(numeros.get(i));
			    	
			    }
			//System.out.println(numeros);
	}
}
