package formasGeometricas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formas f = new Formas();
		Scanner in = new Scanner(System.in);
		int opcao;
		double base, altura, raio;
		
		do {
		
			System.out.println("FORMAS GEOMÉTRICAS:\nEscolha uma da opções para calcular a área\n1 - Quadrado\n2 - Circulo\n3 - Triângulo\n0 - Sair");
			opcao = in.nextInt();
		switch(opcao) {
		case 1:
			System.out.println("Digite o tamanho da base: ");
			base = in.nextDouble();
			System.out.println("Digite o tamanho da altura: ");
			altura = in.nextDouble();
			System.out.println("Quadrado: " + f.quadrado(base,altura) + "\n");
		break;
		case 2:
			System.out.println("Digite o raio do circulo: ");
			raio = in.nextDouble();
			System.out.println("Circulo: " + f.circulo(raio) + "\n");
		break;
		case 3:
			System.out.println("Digite o tamanho da base: ");
			base = in.nextDouble();
			System.out.println("Digite o tamanho da altura: ");
			altura = in.nextDouble();
			System.out.println("Triângulo: " + f.triangulo(base,altura) + "\n");
		break;
		case 0:
			System.out.println("Bye...");
		break;
		default:
			System.out.println("Opção Inválida!");
		break;
		}
		}while(opcao!=0);
	}
}
