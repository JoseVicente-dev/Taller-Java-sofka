import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String frase;

		System.out.println("Ingrese la frase a la que se le quitarán los espacios en blanco: ");
		frase = scan.nextLine();
		System.out.println("Sin espacios: \"" + frase.replace("\s", "")+"\"");

	}

}
