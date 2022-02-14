import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio16 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Ingrese el nombre de la primera persona ");
		String nombrePersona1 = scan.nextLine();
		System.out.println("Ingrese la edad de la primera persona ");
		int edadPersona1 = scan.nextInt();
		System.out.println("Ingrese el sexo (H o M) de la primera persona ");
		char sexoPersona1 = scan.next().charAt(0);
		System.out.println("Ingrese el peso (kg) de la primera persona ");
		double pesoPersona1 = Double.parseDouble(scan.next());
		System.out.println("Ingrese la altura (m) de la primera persona ");
		double alturapersona1 = Double.parseDouble(scan.next());

		Persona persona1 = new Persona(nombrePersona1, edadPersona1, sexoPersona1, pesoPersona1, alturapersona1);
		scan.nextLine();
		System.out.println("Ingrese el nombre de la segunda persona ");
		String nombrePersona2 = scan.nextLine();
		System.out.println("Ingrese la edad de la segunda persona ");
		int edadPersona2 = scan.nextInt();
		System.out.println("Ingrese el sexo (H o M) de la segunda persona ");
		char sexoPersona2 = scan.next().charAt(0);

		Persona persona2 = new Persona(nombrePersona2, edadPersona2, sexoPersona2);

		Persona persona3 = new Persona();

		persona3.setNombre("Pepita");
		persona3.setEdad(11);
		persona3.setSexo('M');
		persona3.setPeso(35);
		persona3.setAltura(1.2);

		ArrayList<Persona> personas = new ArrayList<Persona>();
		personas.add(persona1);
		personas.add(persona2);
		personas.add(persona3);

		for (Persona persona : personas) {
			if (persona.calcularIMC() <0) {
				System.out.println(persona.getNombre() + " está por debajo de su peso ideal");
			} else if (persona.calcularIMC() == 0) {
				System.out.println(persona.getNombre() + " está en su peso ideal");
			} else{
				System.out.println(persona.getNombre() + " está por encima de su peso ideal");
			}
			
			if (persona.esMayorDeEdad()) {
				System.out.println(persona.getNombre()+" es mayor de edad");
			}else {
				System.out.println(persona.getNombre()+" es menor de edad");
			}
			
			System.out.println(persona.toString());
		}

	}
}

class Persona {

	private String nombre = "";
	private int edad = 0;
	private String DNI;
	private char sexo = 'H';
	private double peso = 0;
	private double altura = 0;

	public Persona() {
		super();
		this.generarDNI();
	}

	public Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.comprobarSexo(sexo);
		this.generarDNI();
	}

	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		this.comprobarSexo(sexo);
		this.generarDNI();
	}

	public int calcularIMC() {
		
		double IMC = 0;
		if(this.altura==0) {
			IMC = 0;
		}
		
		if (IMC < 20) {			
			return -1;
		} else if (IMC >= 20 && IMC <= 25) {
			return 0;
		} else {
			return 1;
		}
	}

	public boolean esMayorDeEdad() {
		if (this.edad >= 18) {
			return true;
		} else {
			return false;
		}
	}

	private void comprobarSexo(char sexo) {
		if (sexo == 'M' || sexo == 'H') {
			this.sexo = sexo;
		} else {
			this.sexo = 'H';
		}
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

	/*
	 * Utilizando el algoritmo 23 es muy fácil conseguir la letra de un DNI
	 * realizando un simple cálculo. Para obtener la letra, debemos dividir el
	 * número del DNI entre 23 y en lugar de calcular los decimales, tenemos que
	 * fijarnos en el resto que ofrece la solución. El resto nos dará siempre un
	 * valor entre 0 y 22, y este número determinará cuál es la letra
	 * correspondiente.
	 * 
	 * Para saber cuál es la letra que corresponde a un número de DNI debemos
	 * compararlo con el código TRWAGMYFPDXBNJZSQVHLCKE. El número que obtenemos
	 * determinará la posición de la letra en el código. Es decir, si el resto es 3,
	 * la letra del DNI será la W. Fuente:
	 * https://protecciondatos-lopd.com/empresas/dni-aleatorio/
	 */
	private void generarDNI() {

		int rand = (int) (Math.random() * 100000000);
		String codigo23 = "TRWAGMYFPDXBNJZSQVHLCKE";
		int index = rand % 23;
		this.DNI = String.valueOf(rand) + codigo23.charAt(index);
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public char getSexo() {
		return sexo;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}
}
