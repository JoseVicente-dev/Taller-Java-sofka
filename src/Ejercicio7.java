import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double numero = -1;

		do {
			System.out.println("Ingresa un n�mero mayor o igual que 0");
			while (!scan.hasNextDouble()) {
				String input = scan.next();
				System.out.println("<" + input + "> no es un valor v�lido.");
				System.out.println("Ingresa un n�mero");

			}
			numero = scan.nextDouble();

		} while (numero < 0);

		System.out.println("El n�mero " + numero + " es mayor o igual que 0");

	}

}
