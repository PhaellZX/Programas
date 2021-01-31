package classes;

public class Livro {
	
	String titulo;
	int paginas;
	int numPag;
	
	public void recomecar(int opcao) {
		
		if(opcao != 0 && opcao == 1) {
			
			ler();
		}	
		
		System.out.println("Leitura finalizada!");
	}
	public void ler() {
		
		int pag = 1;
		
		if(this.numPag == this.paginas) {
		
		while(pag != this.numPag) {
			
			System.out.println("Você está lendo o livro " + this.titulo + " na página " + pag);
			pag++;
			
			}
			System.out.println(true);
		}
		
		if(this.numPag < this.paginas) {
			
			System.out.println("Você não terminou de ler o livro " + this.titulo);
			System.out.println(false);
		
		} 
		if(this.numPag > this.paginas) {
			
			System.out.println("O livro não tem esse numero de páginas!!");
			System.out.println(false);
			
		}
	}
}
