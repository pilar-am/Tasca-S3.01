package n1_Singleton;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Singleton
		   Crea una classe que repliqui el funcionament del comando 'Undo'. Aquesta classe ser� utilitzada 
		   per la classe Main, que permetr� introduir opcions per consola.
		   
    	   La classe 'Undo' ha de guardar les �ltimes comandes introdu�des. Ha de permetre afegir o eliminar 
    	   comandes, aix� com llistar les �ltimes comandes introdu�des (semblant a la comanda 'history' en Linux).
    	   
    	   La classe 'Undo' ha d'implementar imprescindiblement un patr� Singleton.
		 */
	
		//Son dos refer�ncies de la mateixa inst�ncia
		Undo undo = Undo.getInstance();
		Undo undo2 = Undo.getInstance();
		
		System.out.println(undo);
		System.out.println(undo2 + "\n");
		
		Scanner entrada = new Scanner(System.in);
		
		int opcio = 0;
		
		do {
			System.out.println(menu());
			opcio = entrada.nextInt();
			if(opcio<0 || opcio>3) {
				System.out.println("\nNo ha ingressat un num correcte\n");
			}else {
				switch(opcio) {
				case 1:
					undo.endavant();
					break;
				case 2:
					undo.darrere();
					break;
				case 3:
					undo.mostrar();
					break;
				case 0:
					System.out.println("Ha sortit del programa");
				}
			}
		}while(opcio != 0);
		
	}
	
	static String menu() {
		String menu = "-------UNDO EN JAVA---------\n"
				+ "1. Capturar comanda\n"
				+ "2. Eliminar comanda\n"
				+ "3. Llistar comandes\n"
				+ "0. Sortir";
		return menu;
	}

}
