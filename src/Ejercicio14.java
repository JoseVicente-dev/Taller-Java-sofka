import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double numero;

		System.out.println("Ingrese un número: ");
		numero = Double.parseDouble(scan.next());

		while (numero <= 1000) {
			System.out.println(numero);
			numero += 2;
		}

	}

}
