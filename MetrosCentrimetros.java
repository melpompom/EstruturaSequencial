import java.util.Scanner;

public class MetrosCentrimetros {

	public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			System.out.print("Digite uma medida em metros: ");
			float metros = entrada.nextFloat();

			System.out.println("Essa medida em centimetro é: "+( metros*100) + "cm");
			entrada.close();

	}

}
