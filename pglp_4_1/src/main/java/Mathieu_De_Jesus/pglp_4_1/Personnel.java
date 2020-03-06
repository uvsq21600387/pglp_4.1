package Mathieu_De_Jesus.pglp_4_1;

import java.util.ArrayList;

/**
 * classe représentant un personnel
 * implémente InterfacePersonnels en tant que leaf.
 */
public final class Personnel implements InterfacePersonnels {
	/**
	 * nom de la personne.
	 */
	private final String  nom;
	/**
	 * prenom de la personne.
	 */
	private final String prenom;
	/**
	 * date de naissance de la personne.
	 */
	private final java.time.LocalDate dateNaissance;
	/**
	 * liste des numéros de téléphone de la personne.
	 */
	private final ArrayList<String> numeroTelephone;
	/**
	 * Pattern builder pour la classe personnel.
	 */
	public static class Builder {
		/**
		 * nom de la personne.
		 */
		private final String nom;
		/**
		 * prenom de la personne.
		 */
		private final String prenom;
		/**
		 * date de naissance de la personne.
		 */
		private final java.time.LocalDate dateNaissance;
		/**
		 * liste des numéros de téléphone de la personne.
		 */
		private final ArrayList<String> numeroTelephone;
		/**
		 * constructeur pour la classe Builder.
		 * @param nomP nom de la personne
		 * @param prenomP prenom de la personne
		 * @param dateNaissanceP date de naissance de la personne
		 * @param numeroTelephoneP les numéros de téléphone
		 * de la personne
		 */
		public Builder(final String nomP, final String prenomP,
			final java.time.LocalDate dateNaissanceP,
			final ArrayList<String> numeroTelephoneP) {
			this.nom = nomP;
			this.prenom = prenomP;
			this.dateNaissance = dateNaissanceP;
			this.numeroTelephone = numeroTelephoneP;
		}
		/**
		 * construit une variable de type Personnel avec le builder.
		 * @return la variable Personnel construit à partir du builder
		 */
		public Personnel build() {
			return new Personnel(this);
		}
	}
	/**
	 * construit le personnel avec le builder.
	 * @param builder le builder pour créer un personnel
	 */
	private Personnel(final Builder builder) {
		nom = builder.nom;
		prenom = builder.prenom;
		dateNaissance = builder.dateNaissance;
		numeroTelephone = builder.numeroTelephone;
	}
	/**
	 * implémentation de la méthode print() de l'interface.
	 */
	public void print() {
		System.out.print(prenom + " " + nom
			+ ", naissance : " + dateNaissance
			+ ", numéros de téléphone : ");
		for (String i : numeroTelephone) {
			System.out.print(i + "  ");
		}
		System.out.println();
	}
}
