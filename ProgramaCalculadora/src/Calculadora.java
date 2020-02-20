
public class Calculadora {
	
	double somar(double valor1, double valor2) {
		return valor1 + valor2;
	}
	double sub(double valor1, double valor2) {
		return valor1 - valor2;
	}
	double mul(double valor1, double valor2) {
		return valor1 * valor2;
	}
	double div(double valor1, double valor2) {
		if(valor1==0) {
		return 0;
		}
		return valor1 / valor2;
	}
	double res(double valor1, double valor2) {
		return valor1 % valor2;
	}
	double pot(double valor1, double valor2) {
	    double res = 1;
		for (int i = 0; i < valor2; i++) {
		     res *= valor1;
		}
		return res;
	}
}
