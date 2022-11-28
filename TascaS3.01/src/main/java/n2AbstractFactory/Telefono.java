package n2AbstractFactory;

public class Telefono extends Agenda{

	private String prefijo;
	private String codigo;
	
	
	
	public Telefono(String prefijo, String codigo) {
		this.prefijo = prefijo;
		this.codigo = codigo;
	}
	
	@Override
	public String getPrefijo() {
		return this.prefijo;
	}
	
	@Override
	public String getCodigo() {
		return this.codigo;
	}
	
	
}
