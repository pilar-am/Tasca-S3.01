package n3Command.dispositivo;

import n3Command.Avio;
import n3Command.Bicicleta;
import n3Command.Cotxe;
import n3Command.Vaixell;
import n3Command.Commands.CommandAvio;
import n3Command.Commands.CommandBicicleta;
import n3Command.Commands.CommandCotxe;
import n3Command.Commands.CommandVaixell;

public class Configuracion {

	public static void configurar(Parking parking) {
		Avio avio = new Avio();
		Bicicleta bicicleta = new Bicicleta();
		Cotxe cotxe = new Cotxe();
		Vaixell vaixell = new Vaixell();
		
		parking.setBoton1(new CommandAvio(avio));
		parking.setBoton2(new CommandBicicleta(bicicleta));
		parking.setBoton3(new CommandCotxe(cotxe));
		parking.setBoton4(new CommandVaixell(vaixell));
		
	}
}
