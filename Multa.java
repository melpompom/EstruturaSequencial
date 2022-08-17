import java.util.Scanner;

public class Multa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float excesso= 0;
		float multa = 0;
		System.out.print("Qual o peso?");
		float peso= entrada.nextFloat();
		if (peso >50) {
		excesso = (peso-50);
		multa = (excesso*4);
		}
		System.out.println("o peso excedente é=" +excesso);
		entrada.close();
	}

}
