package classes;

public class Intervalo {

	private int segundos;
	
	public Intervalo(int horas, int minutos, int segundos) {
		this.setSegundos(segundos);
	}
	
	public Intervalo(int segundos) {
		this.setSegundos(segundos);
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public void soma(Intervalo i) {
		
		int min = 0, horas = 0;
		
		i = new Intervalo(this.segundos);
		
		while(i.segundos >= 60){
			i.segundos = i.segundos - 60;
			if(i.segundos==0){
				i.segundos = 0;
			}
			min++;
		}
		while(min >= 60){
			min = min - 60;
			if(min==0){
				min = 0;
			}
			horas++;
		}
		
		System.out.println("O intervalo de tempo da sua playlist e " + horas + "h: " + min + "min: " + i.segundos + "seg ");
	}
}
