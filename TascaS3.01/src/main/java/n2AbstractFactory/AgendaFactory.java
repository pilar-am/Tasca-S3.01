package n2AbstractFactory;

public class AgendaFactory {

	public static Agenda getAgenda (AgendaAbstractFactory factoria) {
		return factoria.crearAgenda();
	}
}
