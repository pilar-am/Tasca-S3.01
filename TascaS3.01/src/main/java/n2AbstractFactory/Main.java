package n2AbstractFactory;

public class Main {

	/*
	 * Abstract Factory
	Crea un petit gestor de direccions i n�meros de tel�fon internacionals.
    L'aplicaci� ha de permetre afegir a l'agenda, adreces i n�meros de tel�fon internacionals. 
    Tenint en compte els diferents formats dels diferents pa�sos, construeix l'agenda, les adreces i els 
    tel�fons implementant�un patr� Abstract Factory.
	 */
	
	public static void main(String[] args) {
		
		testAgenda();

	}
	
	private static void testAgenda() {
		
		Agenda direccion = AgendaFactory.getAgenda(new DireccionFactory("75000", "Champ de Mars, 5 Av. Anatole France"));
		Agenda telefono = AgendaFactory.getAgenda(new TelefonoFactory("0033", " (0)8 92 70 12 39"));
		
		System.out.println("Direcci�n: " + direccion);
		System.out.println("Tel�fono: " + telefono);
	}

}
