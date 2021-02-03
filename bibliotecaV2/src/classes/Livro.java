package classes;

public class Livro {
	
	private String titulo;
	private int paginas;
	private int numPag;
	
	public Livro() {
		
	}
	
	public String getTitulo() {
		
		return this.titulo;
	}
	
	public void setTitulo(String titulo) {
		
		this.titulo = titulo;
	}
	
	public int getPaginas() {
		
		return this.paginas;
	}
	
	public void setPaginas(int paginas) {
		
		this.paginas = paginas;
	}
	
	public int getNumPag() {
		
		return this.numPag;
	}
	
	public void setNumPag(int numPag) {
		
		this.numPag = numPag;
	}
	
	
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
			
			System.out.println("Voc� est� lendo o livro " + this.titulo + " na p�gina " + pag);
			pag++;
			
			}
			System.out.println(true);
		}
		
		if(this.numPag < this.paginas) {
			
			System.out.println("Voc� n�o terminou de ler o livro " + this.titulo);
			System.out.println(false);
		
		} 
		if(this.numPag > this.paginas) {
			
			System.out.println("O livro n�o tem esse numero de p�ginas!!");
			System.out.println(false);
			
		}
	}
}
