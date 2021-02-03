package classes;

public class Estudante {
	
	private String nome;
	private int idade;
	private float notas[] = new float[3];
	
	public Estudante() {
		
	}
	
	public String getNome() {
		
		return this.nome;
	}
	
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	
	public int getIdade() {
		
		return this.idade;
	}
	
	public void setIdade(int idade) {
		
		this.idade = idade;
	}
	
	public float[] getNotas(){
		
		return this.notas;
	}
	
	public void setNotas(float[] notas) {
		
		this.notas = notas;
	}
	
	public void fazAniversario() {
		
		this.idade++;
		System.out.println("Parabéns! você completa " + this.idade + " anos!");
		
	}
	
	public void insereNota(float nota1, float nota2, float nota3) {
		
		this.notas[0] = nota1;
		this.notas[1] = nota2;
		this.notas[2] = nota3;
		
	}
	
	public void calculaMedia() {
		
		float resultado = (this.notas[0] + this.notas[1] + this.notas[2]) / 3;
		
		System.out.println("A sua media é de: " + resultado);
 		
	}

}
