
public class Ejercicio18 {

	public static void main(String[] args) {

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
