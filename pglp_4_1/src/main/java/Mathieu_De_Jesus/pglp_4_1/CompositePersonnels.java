package Mathieu_De_Jesus.pglp_4_1;

import java.util.ArrayList;
import java.util.Iterator;

public class CompositePersonnels implements InterfacePersonnels, Iterable<InterfacePersonnels>{

	private ArrayList<InterfacePersonnels> personnels;
	
	public void print() {
		for(InterfacePersonnels ip : personnels) {
			ip.print();
		}
	}
	
	public CompositePersonnels add(InterfacePersonnels ip) {
		if(personnels.contains(ip) == false) personnels.add(ip);
		return this;
	}
	
	public CompositePersonnels remove(InterfacePersonnels ip) {
		if(personnels.contains(ip) == true) personnels.remove(ip);
		return this;
	}

	public Iterator<InterfacePersonnels> iterator() {
		return personnels.iterator();
	}
}
