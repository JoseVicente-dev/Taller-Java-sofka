import java.util.Scanner;

public class Ejercicio3 {	
	
	public static void main(String[] args) {
		
		double radio;
		double area;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese el radio del c�rculo");
		radio = Double.parseDouble(scan.next());
		
		area=Math.PI*Math.pow(radio,2);
		
		System.out.println("El �rea del c�rculo de radio "+radio+" es: "+ area);
		

	}
}
