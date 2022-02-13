import java.util.Scanner;
import java.util.StringJoiner;

public class Ejercicio11 {

	public static void main(String[] args) {

		String frase;
		Scanner scan = new Scanner(System.in);
		int contadorA = 0;
		int contadorE = 0;
		int contadorI = 0;
		int contadorO = 0;
		int contadorU = 0;
		System.out.println("Ingrese una frase cualquiera: ");
		frase = scan.nextLine();

		char[] array = frase.toCharArray();

		for (char car : array) {
			if (car == 'a' || car == 'á') {
				contadorA++;
			} else if (car == 'e' || car == 'é') {
				contadorE++;
			} else if (car == 'i' || car == 'í') {
				contadorI++;
			} else if (car == 'o' || car == 'ó') {
				contadorO++;
			} else if (car == 'u' || car == 'ú') {
				contadorU++;
			}
		}

		System.out.println("La longitud de la frase es de " + frase.length() + " caracteres");
		System.out.println("Vocales totales: aes = " + contadorA + "; es = " + contadorE + "; íes = " + contadorI
				+ "; oes = " + contadorO + "; úes = " + contadorU);
	}

}
