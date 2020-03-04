package Mathieu_De_Jesus.pglp_4_1;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * appel à la classe Personnel.
 */
public final class App {
	/**
	 * constructeur de la classe App.
	 */
	private App() {
	}
	/**
	 * début du programme.
	 * @param args arguments donnés au démarrage de l'application
	 */
    public static void main(final String[] args) {
    	ArrayList <String> numero = new ArrayList<String>();
    	numero.add("06.18.12.15.95");
    	numero.add("01.25.46.85.16");
        Personnel p = new Personnel.Builder("man", "Iron", LocalDate.of(1955,05,02), numero).build();
        p.print();
    }
}
