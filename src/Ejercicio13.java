import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		LocalDateTime fechaActual = LocalDateTime.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("(yyyy/MM/dd)(HH:mm:SS)");
		
		System.out.println("Fecha y hora actual: "+fechaActual.format(formato));
		

	}

}
