import java.util.Scanner;

public class GanhaHoras {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe quanto você ganha por hora?");
		Float ganha = entrada.nextFloat();
		
		System.out.print("Informe quantas horas você trabalha?");
		Float horas = entrada.nextFloat();
		
	     System.out.println("O valor do salário no mas é de " + ganha + horas);
	     
	      entrada.close();
}

	}

