package n3Command.Commands;

import n3Command.Cotxe;

public class CommandCotxe implements Command{

	Cotxe cotxe;

	public CommandCotxe(Cotxe cotxe) {
		this.cotxe = cotxe;
	}

	@Override
	public void execute() {
		cotxe.arrencar();
		cotxe.accelerar();
		cotxe.frenar();
	}
	
	
}
