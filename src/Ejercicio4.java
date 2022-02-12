import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
		double IVA =0.21;
		double precio;
		double precioFinal;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese el precio del producto");
		precio = scan.nextDouble();
		
		precioFinal = precio*(1+IVA);
		
		System.out.println("El precio del producto con IVA (21%) es: $"+precioFinal+" pesos");
		
	}

}
