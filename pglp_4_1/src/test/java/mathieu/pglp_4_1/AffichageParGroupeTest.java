package mathieu.pglp_4_1;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

import mathieu.pglp_4_1.Personnel.Builder;

public class AffichageParGroupeTest {

	@Test
	public void test() {
		CompositePersonnels c1 = new CompositePersonnels();
    	CompositePersonnels c2 = new CompositePersonnels();
    	CompositePersonnels c3 = new CompositePersonnels();
    	CompositePersonnels c4 = new CompositePersonnels();
    	CompositePersonnels c5 = new CompositePersonnels();
    	CompositePersonnels c6 = new CompositePersonnels();
    	CompositePersonnels c7 = new CompositePersonnels();
    	ArrayList<String> numero = new ArrayList<String>();
    	numero.add("06.18.12.15.95");
    	numero.add("01.25.46.85.16");
        Personnel p = new Personnel.Builder(
        	"man", "Iron", LocalDate.of(1955, 05, 02), numero).build();
        c7.add(p);
        c4.add(c6);
        c4.add(c7);
        c3.add(c4);
        c3.add(c5);
        c1.add(c2);
        c1.add(c3);
        AfficheParGroupe apg = new AfficheParGroupe();
        apg.parcoursLargeur(c1);
        Iterator<InterfacePersonnels> tmp = apg.iterator();
        
        ArrayList<InterfacePersonnels> list = new ArrayList<InterfacePersonnels>();
        ArrayList<InterfacePersonnels> list2 = new ArrayList<InterfacePersonnels>();
        
        for (; tmp.hasNext(); list.add(tmp.next()));
        list2.add(c1);
        list2.add(c2);
        list2.add(c3);
        list2.add(c4);
        list2.add(c5);
        list2.add(c6);
        list2.add(c7);
        list2.add(p);
        assertTrue(list.toString().equalsIgnoreCase(list2.toString()));
	}

}
