package classes;

public class Janela {

	private String cor;
	private boolean vidroAberto;
	private boolean folhasAbertas;
	private double dimensaoX;
	private double dimensaoY;
	
	public Janela(String cor, boolean vidroAberto,boolean folhasAbertas, double dimensaoX, double dimensaoY) {
		this.cor = cor;
		this.vidroAberto = vidroAberto;
		this.folhasAbertas = folhasAbertas;
		this.dimensaoX = dimensaoX;
		this.dimensaoY = dimensaoY;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public boolean isVidroAberto() {
		return vidroAberto;
	}
	public void setVidroAberto(boolean vidroAberto) {
		this.vidroAberto = vidroAberto;
	}
	public boolean isFolhasAbertas() {
		return folhasAbertas;
	}
	public void setFolhasAbertas(boolean folhasAbertas) {
		this.folhasAbertas = folhasAbertas;
	}
	public double getDimensaoX() {
		return dimensaoX;
	}
	public void setDimensaoX(float dimensaoX) {
		this.dimensaoX = dimensaoX;
	}
	public double getDimensaoY() {
		return dimensaoY;
	}
	public void setDimensaoY(float dimensaoY) {
		this.dimensaoY = dimensaoY;
	}
	
	public void abreVidro() {
		
		this.vidroAberto = true;
		System.out.println(this.vidroAberto);
		System.out.println("Abrir Vidro");
		
	}
	
	public void fechaVidro() {
		
		this.vidroAberto = false;
		System.out.println(this.vidroAberto);
		System.out.println("Fechar Vidro");
		
	}
	
	public void abreFolhas() {
		
		this.folhasAbertas = true;
		System.out.println(this.folhasAbertas);
		System.out.println("Abrir folhas");
	}
	
	public void fechaFolhas() {
		
		this.folhasAbertas = false;
		System.out.println(this.folhasAbertas);
		System.out.println("Fechar folhas");
	}
	
	public boolean folhasAbertas() {
		
		return this.folhasAbertas = true;
	}
	
	public boolean vidrosAbertos() {
		
		return this.vidroAberto = true;
	}
	
	public void estaAberta() {
		
		if(folhasAbertas()==true&&vidrosAbertos()==true) {
			
			System.out.println("Vidro e folhas estão abertos");
			
		} else if(folhasAbertas()==true&&vidrosAbertos()==false) {
			
			System.out.println("Vidro esta fechado mas as folhas estão abertos");
			
		} else if(folhasAbertas()==false&&vidrosAbertos()==true) {
			
			System.out.println("Vidro está aberto mas as folhas estão fechadas");
		
		} else {
			
			System.out.println("Vidro e folhas estão fechados");
		}
		
	}
	
	public void pintar() {
		
		System.out.println("Você pintou a janela de " + this.cor);
		
	}
	
	public void area() {
		
		double area = this.dimensaoX * this.dimensaoY;
		
		System.out.println("A área da janela é :" + area);
		
	}
}
