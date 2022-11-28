package n3Command.Commands;

import n3Command.Vaixell;

public class CommandVaixell implements Command{

	Vaixell vaixell;
	
	public CommandVaixell(Vaixell vaixell) {
		this.vaixell = vaixell;
	}

	@Override
	public void execute() {
		vaixell.arrencar();
		vaixell.accelerar();
		vaixell.frenar();
	}

	
	
	
}
