import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		String diaLaboral;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un d�a de la semana:");
		diaLaboral = scan.nextLine();

		switch (diaLaboral.toLowerCase()) {
		case "lunes":
			System.out.println("Es d�a laboral");
			break;
		case "martes":
			System.out.println("Es d�a laboral");
			break;
		case "miercoles":
			System.out.println("Es d�a laboral");
			break;
		case "mi�rcoles":
			System.out.println("Es d�a laboral");
			break;
		case "jueves":
			System.out.println("Es d�a laboral");
			break;
		case "viernes":
			System.out.println("Es d�a laboral");
			break;
		case "sabado":
			System.out.println("No es d�a laboral");
			break;
		case "s�bado":
			System.out.println("No es d�a laboral");
			break;
		case "domingo":
			System.out.println("No es d�a laboral");
		default:
			System.out.println("<"+diaLaboral+"> no es un d�a v�lido");
			break;
		}

	}

}
