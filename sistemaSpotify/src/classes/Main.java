package classes;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Playlist play = new Playlist("Favoritas");
		
		// ADICIONANDO AS MÚSICAS
		
		Artista artista1 = new Artista("Scorpions");
		Intervalo intervalo1 = new Intervalo(360);
		Musica musica1 = new Musica("Still Loving You",artista1,intervalo1,0);
		
		Artista artista2 = new Artista("Toto");
		Intervalo intervalo2 = new Intervalo(240);
		Musica musica2 = new Musica("África",artista2,intervalo2,0);
		
		Artista artista3 = new Artista("A-ha");
		Intervalo intervalo3 = new Intervalo(240);
		Musica musica3 = new Musica("Take on me",artista3,intervalo3,0);
		
		Artista artista4 = new Artista("Queen");
		Intervalo intervalo4 = new Intervalo(300);
		Musica musica4 = new Musica("Bohemian Rhapsody",artista4,intervalo4,0);
		
		Artista artista5 = new Artista("Bon Jovi");
		Intervalo intervalo5 = new Intervalo(360);
		Musica musica5 = new Musica("Livin' On A Prayer",artista5,intervalo5,0);
		
	
		play.addMusica(musica1);
		play.addMusica(musica2);
		play.addMusica(musica3);
		play.addMusica(musica4);
		play.addMusica(musica5);
		
		System.out.println("\n"+play.getDataCriacao());
		
		// REMOVENDO UMA MÚSICA
		
		//play.removerMusica(musica3);
		
		// ALTERANDO A MÚSICA
		
		Artista artista6 = new Artista("The Police");
		Intervalo intervalo6 = new Intervalo(180);
		Musica musica6 = new Musica("Every Breath You Take",artista6,intervalo6,0);
		
		play.alterarPosicao(musica6, 2);
		
		System.out.println();
		
		// MOSTRANDO TODAS AS MÚSICAS
		
		System.out.println(play.getTitulo()+"\n");
		
		play.getMusicas();
		
		System.out.println();
		
		// SELECIONAR MÚSICA
		
		System.out.println("♫ Música Selecionada: \n");
		
		play.getMusica(1);
		
		System.out.println();
		
		// MOSTRANDO A QTD DE MÚSICAS
		
		play.getTotalMusicas();
		
		System.out.println();
		
		// TEMPO DA PLAYLIST
		
		play.getDuracao(1500);
		
		System.out.println();
		
		// REPRODUÇÂO DA MÚSICA
		
		System.out.println("Tocando...\n");
		
		for(int i = 0; i <= 5; i++) {
			
		play.reproduz();
		
		}
		
		System.out.println("\nQtd de músicas que foram tocadas:\n");
		
		System.out.println("Still Loving You:" + musica1.getQtdReproducao());
		System.out.println("África: " + musica2.getQtdReproducao());
		//System.out.println("Take on me: " + musica3.getQtdReproducao());
		System.out.println("Bohemian Rhapsody: " + musica4.getQtdReproducao());
		System.out.println("Livin' On A Prayer: " + musica5.getQtdReproducao());
		System.out.println("Every Breath You Take: " + musica6.getQtdReproducao());
	}

}
