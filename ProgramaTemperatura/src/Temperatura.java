
public class Temperatura {
	
	int celsiusFahrenheit(int temp) {
		return (temp * 9/5) + 32;
	}
	int celsiusKelvin(int temp) { 
		return temp + 273;
	}
	int fahrenheitCelsius(int temp) {
		return (temp - 32) * 5/9;
	}
	int fahrenheitKelvin(int temp) {
		return (temp - 32) * 5/9 + 273;
	}
	int kelvinCelsius(int temp) {
		return temp - 273;
	}
	int kelvinFahrenheit(int temp) {
		return ((temp - 273) * 9/5) + 32;
	}
}
