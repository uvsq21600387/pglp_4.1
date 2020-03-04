package Mathieu_De_Jesus.pglp_4_1;

import java.util.ArrayList;

public final class Personnel {
	private final String  nom;
	private final String prenom;
	private final java.time.LocalDate dateNaissance;
	private final ArrayList<Integer> numeroTelephone;
	
	public static class Builder {
		private final String  nom;
		private final String prenom;
		private final java.time.LocalDate dateNaissance;
		private ArrayList<Integer> numeroTelephone;
		
		public Builder(final String nom, final String prenom, final java.time.LocalDate dateNaissance) {
			this.nom = nom;
			this.prenom = prenom;
			this.dateNaissance = dateNaissance;
			
			numeroTelephone = new ArrayList<Integer>();
		}
		
		public Builder numeroTelephone(final ArrayList<Integer> numeroTelephone) {
			this.numeroTelephone = numeroTelephone;
			return this;
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
}
