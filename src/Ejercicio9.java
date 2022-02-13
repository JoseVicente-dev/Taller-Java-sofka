import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String frase = "La sonrisa sera la mejor arma contra la tristeza";
		String respuesta;
		String nuevaFrase = "";
		
		System.out.println(frase.replace("a", "e"));

		do {
			System.out.println("\n¿Te gustaría agregar una frase adicional? SI/NO");
			respuesta = scan.nextLine();
			if (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
				System.out.println("<" + respuesta + "> no es una opción válida");
			}
		} while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));

		if (respuesta.equalsIgnoreCase("si")) {
			System.out.println("Ingresa la frase adicional: ");
			nuevaFrase = scan.nextLine();
		}

		System.out.println("\n\""+frase.replace("a", "e") + ". " + nuevaFrase+"\"");
	}
}
