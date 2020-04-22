package mathieu.pglp_4_1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * pattern composite associé à l'interface InterfacePersonnels.
 */
public class CompositePersonnels
implements InterfacePersonnels, Iterable<InterfacePersonnels> {
    /**
     * liste des personnes.
     */
    private ArrayList<InterfacePersonnels> personnels;
    /**
     * identifiant pour identifier un composite.
     */
    private final int id;
    /**
     * pour attribuer un identifiant différent à chaque construction.
     */
    private static int idNext = 1;
    /**
     * constructeur de la classe.
     */
    public CompositePersonnels() {
        id = idNext++;
        personnels = new ArrayList<InterfacePersonnels>();
    }
    /**
     * implémente la méthode print() de l'interface InterfacePersonnels.
     */
    public void print() {
        System.out.println("Id : " + id);
        for (InterfacePersonnels ip : personnels) {
            ip.print();
        }
    }
    /**
     * ajoute une personne à la liste
     * si celle-ci n'est pas déjà dans la liste.
     * @param ip la personne à ajouter
     * @return lui-même
     */
    public CompositePersonnels add(final InterfacePersonnels ip) {
        if (!personnels.contains(ip)) {
            personnels.add(ip);
        }
        return this;
    }
    /**
     * supprime une personne de la liste si celle-ci est dans la liste.
     * @param ip la personne à retirer de la liste
     * @return lui-même
     */
    public CompositePersonnels remove(final InterfacePersonnels ip) {
        if (personnels.contains(ip)) {
            personnels.remove(ip);
        }
        return this;
    }
    /**
     * obtenir un itérateur su la liste des personnes de ce composite.
     * @return iterateur sur la liste des personnes de ce composite
     */
    public Iterator<InterfacePersonnels> iterator() {
        return personnels.iterator();
    }
    /**
     * getter sur l'identifiant de ce composite.
     * @return l'identifiant
     */
    public final int getId() {
        return id;
    }
}
