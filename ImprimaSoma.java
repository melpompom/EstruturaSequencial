import java.util.Scanner;

public class ImprimaSoma {

			public static void main(String[] args) {
				Scanner entrada = new Scanner(System.in);
				
				System.out.print("Digite um n�mero:");
				float n1 = entrada.nextFloat();
				
				System.out.print("Digite outro n�mero:");
				float n2 = entrada.nextFloat();
				System.out.println("A soma �:"+ (n1+n2));
				
				entrada.close();

	}

}
