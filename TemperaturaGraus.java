import java.util.Scanner;

public class TemperaturaGraus {

	public static void main(String[] args) {
Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite a temperatura em grau Fahrenheit: ");
		Float fahrenheit = entrada.nextFloat();
		
		System.out.println("A temperatura em grau Celcios é: " + (((fahrenheit - 32) *5)/9));
		entrada.close();

	}

}
