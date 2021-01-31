package exercicios;

import java.util.Scanner;

public class Exercicio2 {
	
	public static int mmc(int num1, int num2) {
		
		int cont1 = num1, cont2 = num2, res = 1, pos = 0;
		
		while(cont1!=1 || cont2!=1) {
			
			// Divísivel por 2
			
			 if(cont1%2==0) {
				
				cont1 = cont1 / 2;
				res = res * 2;
				
			} 
			 if(cont2%2==0) {
				
				cont2 = cont2 / 2;
				res = res * 2;
	
			}
			
			// Divísivel por 3
			
			 if(cont1%3==0) {
				
				cont1 = cont1 / 3;
				res = res * 3;
				
			} 
			 if(cont2%3==0) {
				
				cont2 = cont2 / 3;
				res = res * 3;
				
			}
			
			// Divísivel por 5
			
			 if(cont1%5==0) {
				
				cont1 = cont1 / 5;
				res = res * 5;
				
			} 
			 if(cont2%5==0) {
				
				cont2 = cont2 / 5;
				res = res * 5;
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.println("Digite o primeiro numero");
		n1 = entrada.nextInt();
		System.out.println("Digite o segundo numero");
		n2 = entrada.nextInt();
		
		System.out.println(mmc(n1,n2));

	}

}
