package Mathieu_De_Jesus.pglp_4_1;

import java.util.ArrayList;

public final class Personnel implements InterfacePersonnels {
	private final String  nom;
	private final String prenom;
	private final java.time.LocalDate dateNaissance;
	private final ArrayList<String> numeroTelephone;
	
	public static class Builder {
		private final String  nom;
		private final String prenom;
		private final java.time.LocalDate dateNaissance;
		private final ArrayList<String> numeroTelephone;
		
		public Builder(final String nom, final String prenom, final java.time.LocalDate dateNaissance, final ArrayList<String> numeroTelephone) {
			this.nom = nom;
			this.prenom = prenom;
			this.dateNaissance = dateNaissance;
			this.numeroTelephone = numeroTelephone;
		}
		
		public Personnel build() {
			return new Personnel(this);
		}
	}
	
	private Personnel(final Builder builder) {
		nom = builder.nom;
		prenom = builder.prenom;
		dateNaissance = builder.dateNaissance;
		numeroTelephone = builder.numeroTelephone;
	}

	public void print() {
		System.out.print(prenom + " " + nom + ", naissance : " + dateNaissance + ", numéros de téléphone : ");
		for(String i : numeroTelephone) {
			System.out.print(i + "  ");
		}
		System.out.println();
	}
}
