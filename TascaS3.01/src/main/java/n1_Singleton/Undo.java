package n1_Singleton;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Undo {

	
	private LinkedList<String> historial = new LinkedList<>();
	
	//Instancia de l'objecte
	private static Undo instance = null;
	
	//Manera de no poder instanciar l'objecte directament
	private Undo() {}

	public static Undo getInstance() {
		if(instance == null) {
			instance = new Undo();
		}
		return instance;
	}
	
	public void endavant() {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introdueix una comanda: ");
		String comanda = entrada.nextLine();
		
		historial.add(comanda);
		
	}
	
	public void darrere() {
		historial.removeLast();
	}
	
	public void mostrar() {
		System.out.print("\nHistorial: ");
		for (String s: historial){
            System.out.print(s + " ");
        }
		System.out.println("\n");
	}
}
