
public class Ejercicio6 {

	public static void main(String[] args) {

		System.out.println("Los números impares y pares del 1 al 100 son:\n");
		System.out.printf("%7s %7s", "Impares", "Pares");
		System.out.println();
		String formato = "%7d %7d";

		for (int i = 1; i < 100; i += 2) {

			System.out.printf(formato, i, i + 1);
			System.out.println();
		}
	}
}
