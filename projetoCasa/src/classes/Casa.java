package classes;

import java.util.ArrayList;

public class Casa {
	
	private String cor;
	private ArrayList<Porta> ListaPorta = new ArrayList<Porta>();
	private ArrayList<Janela> ListaJanela = new ArrayList<Janela>();
	
	public Casa() {
		
	}
	
	public ArrayList<Porta> getListaPorta() {
		return ListaPorta;
	}
	public void setListaPorta(ArrayList<Porta> ListaPorta) {
		this.ListaPorta = ListaPorta;
	}
	
	public ArrayList<Janela> getListaJanela() {
		return ListaJanela;
	}
	public void setListaJanela(ArrayList<Janela> ListaJanela) {
		this.ListaJanela = ListaJanela;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void pintar() {
		
		System.out.println("Você pintou sua casa de " + this.cor);
		
	}
	
	public void inserirPorta(boolean aberta, String cor, double dimensaoX, double dimensaoY) {
		Porta p = new Porta(aberta, cor, dimensaoX, dimensaoY);
		ListaPorta.add(p);
		System.out.println("Porta adicionada!");
	}
	
	public void inserirJanela(String cor, boolean vidroAberto, boolean folhasAbertas, double dimensaoX, double dimensaoY) {
		Janela j = new Janela(cor, vidroAberto, folhasAbertas, dimensaoX, dimensaoY);
		ListaJanela.add(j);
		System.out.println("Janela adicionada!");
	}
	
	public void removePorta(int posicao) {
		ListaPorta.remove(posicao);
		System.out.println("Porta removida!");
	}
	
	public void removeJanela(int posicao) {
		ListaJanela.remove(posicao);
		System.out.println("Janela removida!");
	}
	
	public void totalPortas() {
		System.out.println("TOTAL DE PORTAS " + ListaPorta.size());
	}
	
	public void totalJanelas() {
		System.out.println("TOTAL DE JANELAS " + ListaJanela.size());
	}
	
}
