package mathieu.pglp_4_1;

import java.util.ArrayDeque;
import java.util.Iterator;

/**
 * classe pour l'affichage par groupe d'un InterfacePersonnel.
 */
public class AfficheParGroupe implements Iterable<InterfacePersonnels> {
    /**
     * liste rempli avec le parcours en largeur.
     */
    private ArrayDeque<InterfacePersonnels> c
    = new ArrayDeque<InterfacePersonnels>();
    /**
     * affiche sous forme de parcours en largeur.
     * @param ip InterfacePersonnel à afficher
     */
    public void parcoursLargeur(final InterfacePersonnels ip) {
        if (ip.getClass() == CompositePersonnels.class) {
            InterfacePersonnels y, z;
            CompositePersonnels tmp;
            c = new ArrayDeque<InterfacePersonnels>();
            ArrayDeque<InterfacePersonnels> d =
                new ArrayDeque<InterfacePersonnels>();
            d.add(ip);
            while (!d.isEmpty()) {
                y = d.pollFirst();
                c.add(y);
                if (y.getClass() == CompositePersonnels.class) {
                    tmp = (CompositePersonnels) y;
                    Iterator<InterfacePersonnels> ite =
                        tmp.iterator();
                    while (ite.hasNext()) {
                        z = ite.next();
                        if (!d.contains(z) && !c.contains(z)) {
                            d.add(z);
                        }
                    }
                }
            }
        }
    }
    /**
     * retourne un itérateur sur la liste généré par le parcours.
     * @return itérateur sur la liste rempli par le parcours
     */
    public Iterator<InterfacePersonnels> iterator() {
        return c.iterator();
    }
    /**
     * affiche le parcours en largeur.
     */
    public void print() {
        CompositePersonnels tmp;
        //affichage du parcours
        for (InterfacePersonnels c2 : c) {
            if (c2.getClass() == CompositePersonnels.class) {
                tmp = (CompositePersonnels) c2;
                System.out.println(tmp.getId());
            } else {
                c2.print();
            }
        }
    }
}
