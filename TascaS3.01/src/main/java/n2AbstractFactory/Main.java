package n2AbstractFactory;

public class Main {

	/*
	 * Abstract Factory
	Crea un petit gestor de direccions i números de telèfon internacionals.
    L'aplicació ha de permetre afegir a l'agenda, adreces i números de telèfon internacionals. 
    Tenint en compte els diferents formats dels diferents països, construeix l'agenda, les adreces i els 
    telèfons implementant un patró Abstract Factory.
	 */
	
	public static void main(String[] args) {
		
		testAgenda();

	}
	
	private static void testAgenda() {
		
		Agenda direccion = AgendaFactory.getAgenda(new DireccionFactory("75000", "Champ de Mars, 5 Av. Anatole France"));
		Agenda telefono = AgendaFactory.getAgenda(new TelefonoFactory("0033", " (0)8 92 70 12 39"));
		
		System.out.println("Dirección: " + direccion);
		System.out.println("Teléfono: " + telefono);
	}

}
