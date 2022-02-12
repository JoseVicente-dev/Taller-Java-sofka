
public class Ejercicio5 {

	public static void main(String[] args) {

		int contador = 1;
		System.out.println("Los números impares y pares del 1 al 100 son:\n");
		System.out.printf("%7s %7s", "Impares", "Pares");
		System.out.println();
		String formato = "%7d %7d";
		while (contador < 100) {

			int impar = contador;
			int par = contador + 1;
			System.out.printf(formato, impar, par);
			System.out.println();
			contador += 2;

		}

	}

}
