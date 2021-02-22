package classes;

import java.util.ArrayList;
import java.util.Random;
import java.time.LocalDate;

public class Playlist {
	
	private String titulo;
	private ArrayList<Musica> musica = new ArrayList<>();
	private LocalDate dataCriacao;
	
	public Playlist(String titulo) {
		this.setTitulo(titulo);
		setDataCriacao(LocalDate.now());
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}
	
	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	public void addMusica(Musica m) {  
		
		this.musica.add(m);
		System.out.println("Musica adicionada!");
		
	}
	
	public void removerMusica(Musica m) {  
		
		this.musica.remove(m);
		
	}
	
	public void alterarPosicao(Musica m, int novaPosicao) {  
		
		this.musica.set(novaPosicao, m);
		
	}
	
	public void getMusica(int pos) {
		
		System.out.println(this.musica.get(pos).getTitulo());		
	}
	
	public void getMusicas() {  
		
		for(Musica m: musica) {
			
			System.out.println(m.getTitulo()); 
			
		}
	}
	
	public void getTotalMusicas() { 
		
		System.out.println("♪ Qtd de músicas: " + this.musica.size());
		
	}
	
	public void getDuracao(int seg) {  
		
		Intervalo i = new Intervalo(seg);
		
		i.soma(i);
	}
	
	public void reproduz() {  
		
		Random random = new Random();
		
		Musica tocar = this.musica.get(random.nextInt(musica.size()));
		
		tocar.reproduz();
		System.out.println("♫ " + tocar.getTitulo() + " ♪");
	}
}
