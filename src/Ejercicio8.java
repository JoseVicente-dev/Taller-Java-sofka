import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		String diaLaboral;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un día de la semana:");
		diaLaboral = scan.nextLine();

		switch (diaLaboral.toLowerCase()) {
		case "lunes":
			System.out.println("Es día laboral");
			break;
		case "martes":
			System.out.println("Es día laboral");
			break;
		case "miercoles":
			System.out.println("Es día laboral");
			break;
		case "miércoles":
			System.out.println("Es día laboral");
			break;
		case "jueves":
			System.out.println("Es día laboral");
			break;
		case "viernes":
			System.out.println("Es día laboral");
			break;
		case "sabado":
			System.out.println("No es día laboral");
			break;
		case "sábado":
			System.out.println("No es día laboral");
			break;
		case "domingo":
			System.out.println("No es día laboral");
		default:
			System.out.println("<"+diaLaboral+"> no es un día válido");
			break;
		}

	}

}
