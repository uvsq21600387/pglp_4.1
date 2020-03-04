package Mathieu_De_Jesus.pglp_4_1;

import java.util.ArrayList;

public final class Personnel implements InterfacePersonnels {
	private final int id;
	private final String  nom;
	private final String prenom;
	private final java.time.LocalDate dateNaissance;
	private final ArrayList<String> numeroTelephone;
	
	public static class Builder {
		private static int idNext = 0;
		private final int id;
		private final String  nom;
		private final String prenom;
		private final java.time.LocalDate dateNaissance;
		private final ArrayList<String> numeroTelephone;
		
		public Builder(final String nom, final String prenom, final java.time.LocalDate dateNaissance, final ArrayList<String> numeroTelephone) {
			id = idNext++;
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
		id = builder.id;
		nom = builder.nom;
		prenom = builder.prenom;
		dateNaissance = builder.dateNaissance;
		numeroTelephone = builder.numeroTelephone;
	}

	public void print() {
		System.out.print(id + ", " + prenom + " " + nom + ", naissance : " + dateNaissance + ", numéros de téléphone : ");
		for(String i : numeroTelephone) {
			System.out.print(i + "  ");
		}
		System.out.println();
	}
}
