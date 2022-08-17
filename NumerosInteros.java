import java.util.Scanner;

public class NumerosInteros {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o 1 número inteiro:");
		float n1 = entrada.nextFloat();
		
		System.out.print("Digite o 2 número inteiro: ");
		float n2 = entrada.nextFloat();
		
		System.out.print("Digite o 3 número real: ");
		float n3 = entrada.nextFloat();
		
		System.out.println("o produto do dobro do primeiro com metade do segundo: " +2*n1 * n2/2);
		System.out.println("a soma do triplo do primeiro com o terceiro." +3*n1 * n3);
		System.out.println("O terceiro elavado ao cubo" + 3*n3);
		
		entrada.close();
	}

}
