package n3Command;

import n3Command.dispositivo.Configuracion;
import n3Command.dispositivo.Parking;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Command
		Dissenya un pàrquing de 4 vehicles: un cotxe, una bicicleta, un avió i un vaixell. 
		Mostra com funciona el patró Command que implementa els mètodes arrencar, accelerar i 
		frenar per a cada tipus de vehicle.
		 */

		Parking parking = new Parking();
		
		Configuracion.configurar(parking);
		
		parking.clickBoton1();
		parking.clickBoton2();
		parking.clickBoton3();
		parking.clickBoton4();
		
		
	}

}
