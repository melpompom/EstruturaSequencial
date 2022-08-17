import java.util.Scanner;

public class Peso {

	public static void main(String[] args) {
		      Scanner entrada = new Scanner(System.in);

		      System.out.println("Informe o seu sexo 1-m, 2-f");
		      int sexo = entrada.nextInt();

		      System.out.printf("Informe altura: ");
		      float altura = entrada.nextFloat();

		      if (sexo == 1) {
		    	  System.out.println("Sua altura ideal é " + ((altura*72.7)-58));
		      }
		      else {
		    	  System.out.println("Sua altura ideal é: "+ ((altura*62.1)-44.7));
		      }
		      entrada.close();
	}

}
