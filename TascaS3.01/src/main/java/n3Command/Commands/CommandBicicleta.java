package n3Command.Commands;

import n3Command.Bicicleta;

public class CommandBicicleta implements Command{

	Bicicleta bicicleta;
	
	
	public CommandBicicleta(Bicicleta bicicleta) {
		this.bicicleta = bicicleta;
	}

	@Override
	public void execute() {
		bicicleta.arrencar();
		bicicleta.accelerar();
		bicicleta.frenar();
	}

	
	
	
}
