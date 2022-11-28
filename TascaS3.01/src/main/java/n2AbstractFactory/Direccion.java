package n2AbstractFactory;

public class Direccion extends Agenda{
	
	private String prefijo;
	private String codigo;
	
	
	public Direccion(String prefijo, String codigo) {
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
