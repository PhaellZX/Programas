package classes;

public class Main {

	public static void main(String[] args) {
		
		Casa casa = new Casa();
		
		casa.setCor("Azul");
		casa.inserirPorta(true, "Vermelho", 5.5, 5.2);
		casa.inserirPorta(true, "Amarelo", 6.2, 7.5);
		casa.inserirPorta(false, "Verde", 8.7, 7.4);
		
		casa.inserirJanela("Vermelho", true, true, 5, 5);
		casa.inserirJanela("Azul", true, false, 5, 7);
		casa.inserirJanela("Amarelo", false, true, 9, 7);
		casa.inserirJanela("Cinza", false, false, 8, 8);
		
		casa.totalPortas();
		casa.totalJanelas();

	}

}
