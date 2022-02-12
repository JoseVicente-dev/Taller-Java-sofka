import java.util.Scanner;

public class Ejercicio1y2 {

	public static void main(String[] args) {
		
		double numero1 = 0;
		double numero2 = 1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingresa el primer número");
		numero1= scan.nextDouble();
		System.out.println("Ingresa el segundo número");
		numero2 = scan.nextDouble();
		
		if(numero1<numero2) {
			System.out.println("El primer número, "+numero1 + ", es menor que el segundo número, "+numero2);
		}else if(numero1>numero2) {
			System.out.println("El primer número, "+numero1 + " es mayor que el segundo número,"+numero2);
		}else {
			System.out.println("El primer número, "+numero1 + " es igual al segundo número,"+numero2);
		}
	}	
}
