package classes;

import java.util.Scanner;

public class TesteEstudante {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Estudante estudante = new Estudante();
		float n1, n2, n3;
		String n;
		int i;
		
		System.out.println("Digite o seu nome: ");
		n = entrada.next();
		estudante.setNome(n); 
		System.out.println("Digite a sua idade: ");
		i = entrada.nextInt();
		estudante.setIdade(i); 
		
		estudante.fazAniversario();
		
		System.out.println("Digite a primeira nota: ");
		n1 = entrada.nextFloat();
		System.out.println("Digite a segunda nota: ");
		n2 = entrada.nextFloat();
		System.out.println("Digite a terceira nota: ");
		n3 = entrada.nextFloat();
		
		estudante.insereNota(n1, n2, n3);
		estudante.calculaMedia();
		
		System.out.println("Finalizando...");
		
	}

}
