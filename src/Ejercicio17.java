
public class Ejercicio17 {

	public static void main(String[] args) {
		
		Electrodomestico[] electrodomesticos = new Electrodomestico[10];
		
		Lavadora lavadora1 = new Lavadora();
		Lavadora lavadora2 = new Lavadora(120,20);
		Lavadora lavadora3 = new Lavadora(120,52);
		Lavadora lavadora4 = new Lavadora(200,"negro",'C',19,12);
		Lavadora lavadora5 = new Lavadora(100,"rojo",'A',80,31);
		
		Television television1 = new Television();
		Television television2 = new Television(110,6);
		Television television3 = new Television(130,21);
		Television television4 = new Television(120,"azul",'D',19,20,true);
		Television television5 = new Television(100,"azul",'D',5,41,true);
		
		
		electrodomesticos[0]=lavadora1;
		electrodomesticos[1]=lavadora2;
		electrodomesticos[2]=lavadora3;
		electrodomesticos[3]=lavadora4;
		electrodomesticos[4]=lavadora5;
		electrodomesticos[5]=television1;
		electrodomesticos[6]=television2;
		electrodomesticos[7]=television3;
		electrodomesticos[8]=television4;
		electrodomesticos[9]=television5;
		
		double precioTotalLavadoras=0;
		double precioTotalTelevisores =0;
		double precioTotal=0;
		
		for(Electrodomestico electrodomestico: electrodomesticos) {
			double precioActual = electrodomestico.precioFinal();
			precioTotal+=precioActual;
			//System.out.println(precioActual);
			if(electrodomestico instanceof Television) {
				precioTotalTelevisores+=precioActual;				
			}else if(electrodomestico instanceof Lavadora) {
				precioTotalLavadoras+=precioActual;
			}
		}
		
		String formato = "%11s %12s";
		System.out.printf(formato,"Artículos","valor(euros)");
		System.out.println();
		System.out.printf(formato,"Televisores",precioTotalTelevisores);
		System.out.println();
		System.out.printf(formato,"Lavadoras",precioTotalLavadoras);
		System.out.println();
		System.out.printf(formato,"TOTAL",precioTotal);
		
	}

}

class Electrodomestico {

	protected double precioBase = 100;
	protected String color = "blanco";
	protected char consumoEnergetico = 'F';
	protected int peso = 5;

	public Electrodomestico(double precioBase, String color, char consumoEnergetico, int peso) {
		super();
		this.precioBase = precioBase;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
		this.comprobarColor(color);
		this.comprobarConsumoEnergetico(consumoEnergetico);
	}

	public Electrodomestico(double precioBase, int peso) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public Electrodomestico() {

	}

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	private void comprobarConsumoEnergetico(char letra) {
		switch (letra) {
		case 'A':
			this.consumoEnergetico = 'A';
			break;
		case 'B':
			this.consumoEnergetico = 'B';
			break;
		case 'C':
			this.consumoEnergetico = 'C';
			break;
		case 'D':
			this.consumoEnergetico = 'D';
			break;
		case 'E':
			this.consumoEnergetico = 'E';
			break;
		default:
			this.consumoEnergetico = 'F';
			break;
		}
	}

	private void comprobarColor(String color) {
		switch (color.toLowerCase()) {
		case "negro":
			this.color = "negro";
			break;
		case "rojo":
			this.color = "rojo";
			break;
		case "gris":
			this.color = "gris";
			break;
		case "azul":
			this.color = "azul";
			break;
		default:
			this.color = "blanco";
			break;
		}
	}

	public double precioFinal() {

		switch (this.consumoEnergetico) {
		case 'A':
			this.precioBase += 100;
			break;
		case 'B':
			this.precioBase += 80;
			break;
		case 'C':
			this.precioBase += 60;
			break;
		case 'D':
			this.precioBase += 50;
			break;
		case 'E':
			this.precioBase += 30;
			break;
		case 'F':
			this.precioBase += 10;
			break;
		}

		if (this.peso <= 19) {
			this.precioBase += 10;
		} else if (this.peso >= 20 && this.peso <= 49) {
			this.precioBase += 50;
		} else if (this.precioBase >= 50 && this.precioBase <= 79) {
			this.precioBase += 80;
		} else {
			this.precioBase += 100;
		}

		return this.precioBase;

	}

}

class Lavadora extends Electrodomestico {

	private int carga = 5;

	public Lavadora(double precioBase, int peso) {
		super(precioBase, peso);
	}

	public Lavadora(double precioBase, String color, char consumoEnergetico, int peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	public Lavadora() {
		super();
	}

	public int getCarga() {
		return carga;
	}

	public double precioFinal() {

		super.precioFinal();
		if (this.carga > 30) {
			this.precioBase += 50;
		}

		return precioBase;
	}

}

class Television extends Electrodomestico {

	private int resolucion = 20;
	private boolean sintonizadorTDT = false;

	public Television(double precioBase, int peso) {
		super(precioBase, peso);
	}

	public Television(double precioBase, String color, char consumoEnergetico, int peso, int resolucion,
			boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	public Television() {
		super();
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public double precioFinal() {

		super.precioFinal();

		if (this.resolucion > 40) {
			this.precioBase = this.precioBase * 1.3;
		}

		if (isSintonizadorTDT()) {
			this.precioBase += 50;
		}

		return precioBase;
	}

}
