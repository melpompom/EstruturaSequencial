import java.util.Scanner;

public class DoisNumeros {

	public static void main(String[] args) {

			Scanner entrada = new Scanner(System.in);
			
			System.out.print("Digite um numero:");
					int numero = entrada.nextInt();
					System.out.println("O n�mero informado foi" + numero);
					entrada.close();
		}

	}
