import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String palabra1;
		String palabra2;

		System.out.println("Ingresa la primera palabra");
		palabra1 = scan.next();
		System.out.println("Ingresa la segunda palabra");
		palabra2 = scan.next();
		
		int masCorta;
		
		if(palabra1.equalsIgnoreCase(palabra2)) {
			System.out.println("La palabras son iguales");
			return;
		}
		
		if (palabra1.length()<palabra2.length()) {
			System.out.println("La primera palabra, <"+palabra1+"> es más corta que la segunda, <"+palabra2+">");
		}else if(palabra1.length()<palabra2.length()) {
			System.out.println("La primera palabra, <"+palabra1+"> es más larga que la segunda, <"+palabra2+">");
		}else {
			
			char[] arrpalabra1 =palabra1.toCharArray();
			char[] arrpalabra2 =palabra2.toCharArray();
			
			for(int i=0;i<arrpalabra1.length;i++) {
				if(arrpalabra1[i]!=arrpalabra2[i]) {
					arrpalabra1[i]=Character.toUpperCase(arrpalabra1[i]);
					arrpalabra2[i]=Character.toUpperCase(arrpalabra2[i]);
				}
			}
			
			palabra1=String.valueOf(arrpalabra1);
			palabra2=String.valueOf(arrpalabra2);
			
			System.out.println("Las palabras son diferentes: "+palabra1+" /= "+palabra2);
		}
		
		
		

	}

}
