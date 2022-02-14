
public class Ejercicio18 {

	public static void main(String[] args) {

		Serie[] series = new Serie[5];
		Videojuego[] videojuegos = new Videojuego[5];

		Serie serie1 = new Serie("Peacemaker", "Josh");
		Serie serie2 = new Serie("SnK", 4, "anime", "Isayama");
		Serie serie3 = new Serie("Dark", 3, "suspenso", "bo Odar");
		Serie serie4 = new Serie("Cowboy bebop", 1, "anime", "Watanabe");
		Serie serie5 = new Serie("Seinfeld", 9, "comedia", "Seinfeld");

		Videojuego vg1 = new Videojuego("FF7", 100);
		Videojuego vg2 = new Videojuego("GoW2", 40);
		Videojuego vg3 = new Videojuego("GTA6", 60);
		Videojuego vg4 = new Videojuego("SF2", 10);
		Videojuego vg5 = new Videojuego("DK1", 30);

		series[0] = serie1;
		series[1] = serie2;
		series[2] = serie3;
		series[3] = serie4;
		series[4] = serie5;

		videojuegos[0] = vg1;
		videojuegos[1] = vg2;
		videojuegos[2] = vg3;
		videojuegos[3] = vg4;
		videojuegos[4] = vg5;

		serie1.entregar();
		serie4.entregar();

		vg1.entregar();
		vg3.entregar();
		vg5.entregar();

		int seriesEntregadas = 0;
		int vgEntregados = 0;

		Serie serieMasTemporadas = series[0];
		Videojuego vgMasLargo=videojuegos[0];

		for (Serie s : series) {
			if (s.isEntregado()) {
				seriesEntregadas++;
				s.devolver();
			}

			if (s.compareTo(serieMasTemporadas) > 0) {
				serieMasTemporadas = s;
			}
		}
		
		for(Videojuego v: videojuegos) {
			if(v.isEntregado()) {
				vgEntregados++;
				v.devolver();
			}
			
			if (v.compareTo(vgMasLargo)>0) {
				vgMasLargo=v;
			}
		}
		
		System.out.println("Series entregadas = "+seriesEntregadas);
		System.out.println("La serie con más temporadas es: ");
		System.out.println(serieMasTemporadas.toString());
		System.out.println("Videojuego entregrados = "+vgEntregados);
		System.out.println("El videojuego con más horas estimadas es: ");
		System.out.println(vgMasLargo.toString());

	}

}

interface Entregable {

	public void entregar();

	public void devolver();

	public boolean isEntregado();

	public int compareTo(Object o);
}

class Serie implements Entregable {

	private String titulo;
	private int numeroDeTemporadas = 3;
	private boolean entregado = false;
	private String genero;
	private String creador;

	public Serie(String titulo, int numeroDeTemporadas, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.numeroDeTemporadas = numeroDeTemporadas;
		this.genero = genero;
		this.creador = creador;
	}

	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.creador = creador;
	}

	public Serie() {
		super();
	}

	public String getTitulo() {
		return titulo;
	}

	public int getNumeroDeTemporadas() {
		return numeroDeTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setNumeroDeTemporadas(int numeroDeTemporadas) {
		this.numeroDeTemporadas = numeroDeTemporadas;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numeroDeTemporadas=" + numeroDeTemporadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}

	public void entregar() {
		this.entregado = true;
	}

	public void devolver() {
		this.entregado = false;
	}

	public boolean isEntregado() {
		return this.entregado;
	}

	public int compareTo(Object s) {

		Serie serie = (Serie) s;

		if (serie.numeroDeTemporadas < this.numeroDeTemporadas) {
			return 1;
		} else if (serie.numeroDeTemporadas == this.numeroDeTemporadas) {
			return 0;
		} else {
			return -1;
		}

	}

}

class Videojuego implements Entregable {

	private String titulo;
	private double horasEstimadas = 10;
	private boolean entregado = false;
	private String genero;
	private String compania;

	public Videojuego(String titulo, double horasEstimadas, String genero, String compania) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compania = compania;
	}

	public Videojuego(String titulo, double horasEstimadas) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
	}

	public Videojuego() {
		super();
	}

	public String getTitulo() {
		return titulo;
	}

	public double getHorasEstimadas() {
		return horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public String getCompania() {
		return compania;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setHorasEstimadas(double horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compania=" + compania + "]";
	}

	public void entregar() {
		this.entregado = true;
	}

	public void devolver() {
		this.entregado = false;
	}

	public boolean isEntregado() {
		return this.entregado;
	}

	public int compareTo(Object v) {
		Videojuego videojuego = (Videojuego) v;
		if (videojuego.horasEstimadas < this.horasEstimadas) {
			return 1;
		} else if (videojuego.horasEstimadas == this.horasEstimadas) {
			return 0;
		} else {
			return -1;
		}
	}

}
