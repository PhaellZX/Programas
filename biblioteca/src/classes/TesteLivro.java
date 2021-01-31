package classes;

import java.util.Scanner;

public class TesteLivro {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Livro livro = new Livro();
		int opcao;
		
		System.out.println("Digite o titulo do livro:");
		livro.titulo = entrada.next();
		System.out.println("Digite o número de páginas tem o livro:");
		livro.paginas = entrada.nextInt();
		
		System.out.println("Digite o número de páginas que será lido:");
		livro.numPag = entrada.nextInt();
		
		livro.ler();
		
		System.out.println("Deseja recomeçar a ler o livro?");
		opcao = entrada.nextInt();
		
		livro.recomecar(opcao);

	}
}
