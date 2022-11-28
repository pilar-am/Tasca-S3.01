package n3Command.Commands;

import n3Command.Avio;

public class CommandAvio implements Command{

	Avio avio;
	
	public CommandAvio(Avio avio) {
		this.avio = avio;
	}

	@Override
	public void execute() {
		avio.arrencar();
		avio.accelerar();
		avio.frenar();
	}

}
