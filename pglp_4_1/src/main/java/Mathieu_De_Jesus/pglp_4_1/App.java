package Mathieu_De_Jesus.pglp_4_1;

import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

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
	 * affiche sous forme de parcours en largeur.
	 * @param ip InterfacePersonnel à afficher
	 */
	public static void ParcoursLargeur(final InterfacePersonnels ip) {
		if(ip.getClass() == CompositePersonnels.class) {
			InterfacePersonnels y, z;
			CompositePersonnels tmp;
			ArrayDeque<InterfacePersonnels> C = new ArrayDeque<InterfacePersonnels> ();
			ArrayDeque<InterfacePersonnels> D = new ArrayDeque<InterfacePersonnels> ();
			D.add(ip);
			while (D.isEmpty() == false) {
				y = D.pollFirst();
				C.add(y);
				if (y.getClass() == CompositePersonnels.class) {
					tmp = (CompositePersonnels) y;
					Iterator<InterfacePersonnels> ite = tmp.iterator();
					while(ite.hasNext()) {
						z = ite.next();
						if (D.contains(z) == false && C.contains(z) == false) {
							D.add(z);
						}	
					}
				}
			}
			//affichage du parcours
			for (InterfacePersonnels c : C) {
				if (c.getClass() == CompositePersonnels.class) {
					tmp = (CompositePersonnels) c;
					System.out.println(tmp.getId());
				}
				else {
					c.print();
				}
			}
		}
		else {
			ip.print();
		}
	}
	/**
	 * début du programme.
	 * @param args arguments donnés au démarrage de l'application
	 */
    public static void main(final String[] args) {
    	
    	CompositePersonnels c1 = new CompositePersonnels();
    	CompositePersonnels c2 = new CompositePersonnels();
    	CompositePersonnels c3 = new CompositePersonnels();
    	CompositePersonnels c4 = new CompositePersonnels();
    	CompositePersonnels c5 = new CompositePersonnels();
    	CompositePersonnels c6 = new CompositePersonnels();
    	CompositePersonnels c7 = new CompositePersonnels();
    	
    	ArrayList <String> numero = new ArrayList<String>();
    	numero.add("06.18.12.15.95");
    	numero.add("01.25.46.85.16");
        Personnel p = new Personnel.Builder("man", "Iron", LocalDate.of(1955,05,02), numero).build();
        
        c7.add(p);
        c4.add(c6);
        c4.add(c7);
        c3.add(c4);
        c3.add(c5);
        c1.add(c2);
        c1.add(c3);
        
        System.out.println("Parcours en largeur : ");
        ParcoursLargeur(c1);
        
        System.out.println("\n\nParcours en profondeur : ");
        c1.print();
    }
}
