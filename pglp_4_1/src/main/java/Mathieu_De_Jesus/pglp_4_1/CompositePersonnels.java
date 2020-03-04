package Mathieu_De_Jesus.pglp_4_1;

import java.util.ArrayList;

public class CompositePersonnels implements InterfacePersonnels {

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
}
