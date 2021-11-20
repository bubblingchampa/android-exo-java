package ecole;


	public class Etudiant extends Personne {
		 
		private String matricule;
	 
		public Etudiant(String nom, String prenom, String matricule) {
			super(nom, prenom);
			this.matricule = matricule;
		}
	 
		@Override
		public String toString() {
			return super.toString() + " mon matricule est: " + this.matricule;
		}
	 
	}


