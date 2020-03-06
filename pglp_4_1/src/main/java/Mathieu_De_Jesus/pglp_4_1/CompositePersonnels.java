package Mathieu_De_Jesus.pglp_4_1;

import java.util.ArrayList;
import java.util.Iterator;

public class CompositePersonnels implements InterfacePersonnels, Iterable<InterfacePersonnels>{

	private ArrayList<InterfacePersonnels> personnels;
	private final int id;
	private static int idNext = 1; 
	
	public CompositePersonnels() {
		id = idNext++;
		personnels = new ArrayList<InterfacePersonnels>();
	}
	
	public void print() {
		System.out.println("Id : " + id);
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
	
	public final int getId() {
		return id;
	}
}
