package exercicios;

import java.util.Scanner;

public class Exercicio1 {
	
	public static int maior(int num1, int num2) {
		
		if(num1 > num2) {
			
			return num1;
			
		} else if(num1 < num2) {
			
			return num2;
			
		} else {
			
			return 0;
			
		}
	}
	
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.println("Digite o primeiro número");
		n1 = entrada.nextInt();
		System.out.println("Digite o segundo número");
		n2 = entrada.nextInt();
		
		System.out.println(maior(n1,n2));
		
	}
}
