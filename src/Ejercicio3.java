import java.util.Scanner;

public class Ejercicio3 {	
	
	public static void main(String[] args) {
		
		double radio;
		double area;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese el radio del círculo");
		radio = Double.parseDouble(scan.next());
		
		area=Math.PI*Math.pow(radio,2);
		
		System.out.println("El área del círculo de radio "+radio+" es: "+ area);
		

	}
}
