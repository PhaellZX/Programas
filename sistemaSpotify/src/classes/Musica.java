package classes;

public class Musica {
	
	private String titulo;
	private Artista artista;
	private Intervalo duracao;
	private int qtdReproducao = 0;
	
	public Musica(String titulo, Artista artista, Intervalo duracao, int qtdReproducao) {
		this.setTitulo(titulo);
		this.setArtista(artista);
		this.setDuracao(duracao);
		this.setQtdReproducao(qtdReproducao);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}

	public Intervalo getDuracao() {
		return duracao;
	}

	public void setDuracao(Intervalo duracao) {
		this.duracao = duracao;
	}

	public int getQtdReproducao() {
		return qtdReproducao;
	}

	public void setQtdReproducao(int qtdReproducao) {
		this.qtdReproducao = qtdReproducao;
	}
	
	public void reproduz() {
		this.qtdReproducao++;
	}
	
}
