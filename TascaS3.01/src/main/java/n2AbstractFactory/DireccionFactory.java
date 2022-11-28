package n2AbstractFactory;

public class DireccionFactory implements AgendaAbstractFactory{

	private String prefijo;
	private String codigo;
	
	
	public DireccionFactory(String prefijo, String codigo) {
		this.prefijo = prefijo;
		this.codigo = codigo;
	}

	@Override
	public Agenda crearAgenda() {
		return new Direccion(prefijo, codigo);
	}

}
