package n2AbstractFactory;

public class TelefonoFactory implements AgendaAbstractFactory{

	private String prefijo;
	private String codigo;
	
	
	public TelefonoFactory(String prefijo, String codigo) {
		this.prefijo = prefijo;
		this.codigo = codigo;
	}

	@Override
	public Agenda crearAgenda() {
		return new Telefono(prefijo, codigo);
	}
	
	
}
