import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	int seleccion=8;
	String menu = "\n"
			+ "	/*    ****** GESTION CINEMATOGRÁFICA ********\n"
			+ "1-NUEVO ACTOR\n"
			+ "2-BUSCAR ACTOR\n"
			+ "3-ELIMINAR ACTOR\n"
			+ "4-MODIFICAR ACTOR\n"
			+ "5-VER TODOS LOS ACTORES\n"
			+ "6- VER PELICULAS DE LOS ACTORES\n"
			+ "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n"
			+ "8-SALIR";
	
	
	do {
		
		System.out.println(menu);
		
		System.out.println("\nDigite el número de la opcion");		
		while (!scan.hasNextInt()) {
			String input = scan.next();
			System.out.println("OPCIÓN INCORRECTA");
			
			System.out.println(menu);

		}
		
		seleccion=scan.nextInt();
		
		switch (seleccion) {
		case 1:
			System.out.println("Escogio la opcion "+seleccion);
			break;
		case 2:
			System.out.println("Escogio la opcion "+seleccion);
			break;
		case 3:
			System.out.println("Escogio la opcion "+seleccion);
			break;
		case 4:
			System.out.println("Escogio la opcion "+seleccion);
			break;
		case 5:
			System.out.println("Escogio la opcion "+seleccion);
			break;
		case 6:
			System.out.println("Escogio la opcion "+seleccion);
			break;
		case 7:
			System.out.println("Escogio la opcion "+seleccion);
			break;
		case 8:
			System.out.println("Saliendo...");
			break;
		default:
			System.out.println("OPCIÓN INCORRECTA");
			break;
		}
	}while(seleccion!=8);

	}

}
