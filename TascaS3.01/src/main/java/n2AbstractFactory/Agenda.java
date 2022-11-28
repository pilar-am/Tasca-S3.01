package n2AbstractFactory;

public abstract class Agenda {
	
	public abstract String getPrefijo();
	public abstract String getCodigo();
	
	
	@Override
	public String toString() {
		return "Agenda: Prefijo País: " + getPrefijo() + ", Dirección/Teléfono: " + getCodigo() ;
	}
	
	
}
