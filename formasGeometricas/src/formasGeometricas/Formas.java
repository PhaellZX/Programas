package formasGeometricas;

public class Formas {
	
	double quadrado(double cat1,double cat2) {
		return cat1 * cat2;
	}
	double circulo(double raio) {
		double pi = 3.1415926;
		return pi * (raio * raio);
	}
	double triangulo(double b, double h) {  
		return  (b * h) / 2;
	}
}
