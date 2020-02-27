import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Temperatura temperatura = new Temperatura();
		int temp, opcao;
		
		do {
		
		System.out.println("CONVERSÃO DE TEMPERATURA:\n1 - Celsius / Fahrenheit\n2 - Celsius / Kelvin\n3 - Fahrenheit / Celsius\n4 - Fahrenheit / Kelvin\n5 - Kelvin / Celsius\n6 - Kelvin / Fahrenheit\n0 - Sair");
		opcao = in.nextInt();
		
		switch(opcao) {
		     case 1:
		    	 temp = 0;
		    	 System.out.println("Digita a temperatura: " + temp + "°C");
		    	 temp = in.nextInt();
		    	 System.out.println("A temperatura é " + temperatura.celsiusFahrenheit(temp) + "°F");
		     break;
		     case 2:
		    	 temp = 0;
		    	 System.out.println("Digita a temperatura: " + temp + "°C");
		    	 temp = in.nextInt();
		    	 System.out.println("A temperatura é " + temperatura.celsiusKelvin(temp) + "K");
		     break;
		     case 3:
		    	 temp = 32;
		    	 System.out.println("Digita a temperatura: " + temp + "°F");
		    	 temp = in.nextInt();
		    	 System.out.println("A temperatura é " + temperatura.fahrenheitCelsius(temp) + "°C");
		     break;
		     case 4:
		    	 temp = 32;
		    	 System.out.println("Digita a temperatura: " + temp + "°F");
		    	 temp = in.nextInt();
		    	 System.out.println("A temperatura é " + temperatura.fahrenheitKelvin(temp) + "K");
		     break;
		     case 5:
		    	 temp = 0;
		    	 System.out.println("Digita a temperatura: " + temp + "K");
		    	 temp = in.nextInt();
		    	 System.out.println("A temperatura é " + temperatura.kelvinCelsius(temp) + "°C");
		     break;
		     case 6:
		    	 temp = 0;
		    	 System.out.println("Digita a temperatura: " + temp + "K");
		    	 temp = in.nextInt();
		    	 System.out.println("A temperatura é " + temperatura.kelvinFahrenheit(temp) + "°F");
		     break;
		     case 0:
		    	 System.out.println("saindo...");
		     break;
		     default:
		    	 System.out.println("Valor incorreto!");
		    	 break;
		}
		}while(opcao!=0);
	}

}
