import java.util.Scanner;

public class PesoIdeal {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a sua altura: ");
		float altura = entrada.nextFloat(); 
		
		System.out.println("O seu peso ideal �: " + (72.7 * altura - 58));
		entrada.close();
	}

}
