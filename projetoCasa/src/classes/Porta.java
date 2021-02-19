package classes;

public class Porta {
	
	private boolean aberta;
	private String cor;
	private double dimensaoX;
	private double dimensaoY;
	
	public Porta(boolean aberta, String cor, double dimensaoX, double dimensaoY) {
		this.aberta = aberta;
		this.cor = cor;
		this.dimensaoX = dimensaoX;
		this.dimensaoY = dimensaoY;
	}

	public boolean isAberta() {
		return aberta;
	}

	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
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
	
	public void abre() {
		
		this.aberta = true;
		System.out.println(this.aberta);
		System.out.println("Abrir Porta!");
		
	}
	
	public void fecha() {
		
		this.aberta = false;
		System.out.println(this.aberta);
		System.out.println("Fechar Porta!");
		
	}
	
	public void pintar() {
		
		System.out.println("Você pintou a porta de " + this.cor);
	
	}
	
	public void estaAberta() {
		
		System.out.println("A Porta está aberta!");
		
	}
	

}
