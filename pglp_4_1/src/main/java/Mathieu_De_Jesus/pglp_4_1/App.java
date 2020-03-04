package Mathieu_De_Jesus.pglp_4_1;

import java.time.LocalDate;

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
        Personnel p = new Personnel.Builder("man", "Iron", LocalDate.of(1955,05,02)).build();
    }
}
