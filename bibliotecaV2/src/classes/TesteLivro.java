package classes;

import java.util.Scanner;

public class TesteLivro {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Livro livro = new Livro();
		String tit;
		int opcao, pag, npag;
		
		System.out.println("Digite o titulo do livro:"); 
		tit = entrada.next();
		livro.setTitulo(tit);
		System.out.println("Digite o n�mero de p�ginas tem o livro:");
		pag = entrada.nextInt();
		livro.setPaginas(pag);
		
		System.out.println("Digite o n�mero de p�ginas que ser� lido:");
		npag = entrada.nextInt();
		livro.setNumPag(npag);
		
		livro.ler();
		
		System.out.println("Deseja recome�ar a ler o livro?");
		opcao = entrada.nextInt();
		
		livro.recomecar(opcao);

	}
}
