import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calc = new Calculadora();
		Scanner in = new Scanner(System.in);
		char operador;
		double val1, val2, guardar = 0;
		
		System.out.print("Calculadora:\nDigite o 1° valor:");
		val1 = in.nextDouble();
		System.out.print("Digite o 2° valor:");
		val2 = in.nextDouble();
		
		System.out.println("Escolha umas das operações:\nDigite:\n + |para soma\n - |para subtrair\n * |para multiplicar\n / |para dividir\n r |para o resto\n p |para a potenciação\n");
		
		operador = in.next().charAt(0); // Ler uma caracter
		
		switch(operador){
		     case '+':
		    	 System.out.println("Soma: " + calc.somar(val1,val2)); 
		    	 guardar = guardar + (calc.somar(val1,val2));
		     break;
		     case '-':
		    	 System.out.println("Subtrair: " + calc.sub(val1,val2));
		    	 guardar = guardar + (calc.sub(val1,val2));
		     break;
		     case '*':
				System.out.println("Multiplicar: " + calc.mul(val1,val2));
				 guardar = guardar + (calc.mul(val1,val2));
			 break;
		     case '/':
				System.out.println("Divisão: " + calc.div(val1,val2));
				 guardar = guardar + (calc.div(val1,val2));
			 break;
		     case 'r':
				System.out.println("Resto: " + calc.res(val1,val2));
				 guardar = guardar + (calc.res(val1,val2));
		     break;
		     case 'p':
				System.out.println("Potenciação: " + calc.pot(2,3));
				 guardar = guardar + (calc.pot(val1,val2));
			 break;
			 default:
				 System.out.println("Operador inválido");
			 break;
			}	
		     int opcao;
		     double num;
		     
		    do {
			System.out.print("\nDeseja Continuar?sim(qualquer numero) não(0)");
			opcao = in.nextInt();
			if(opcao!=0) {
			System.out.print("Digite um valor:");
			num = in.nextDouble();
			System.out.println("Escolha umas das operações:\nDigite:\n + |para soma\n - |para subtrair\n * |para multiplicar\n / |para dividir\n r |para o resto\n p |para a potenciação\n");
		    operador = in.next().charAt(0);
		    
		    if(opcao!=0) {
			switch(operador){
		     case '+':
		    	 System.out.println("Soma: " + calc.somar(guardar,num)); 
		    	 guardar = calc.somar(guardar,num);
		     break;
		     case '-':
		    	 System.out.println("Subtrair: " + calc.sub(guardar,num));
		    	 guardar = calc.sub(guardar, num);
		     break;
		     case '*':
				System.out.println("Multiplicar: " + calc.mul(guardar,num));
				guardar = calc.mul(guardar, num);
			 break;
		     case '/':
				System.out.println("Divisão: " + calc.div(guardar,num));
				guardar = calc.div(guardar, num);
			 break;
		     case 'r':
				System.out.println("Resto: " + calc.res(guardar,num));
				guardar = calc.res(guardar, num);
		     break;
		     case 'p':
				System.out.println("Potenciação: " + calc.pot(guardar,num)); 
				guardar = calc.pot(guardar, num);
			 break;
			 default:
				 System.out.println("Operador inválido");
			 break;
			}
		    }
			}
		}while(opcao!=0); 
		    System.out.println("Calculadora Finalizada!");
			}
    		}
