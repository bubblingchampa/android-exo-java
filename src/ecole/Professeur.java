package ecole;

public class Professeur extends Employe {
	 
	private String specialite;
 
	public Professeur(String nom, String prenom, double salaire,
			String specialite) {
		super (nom, prenom, salaire);
		this.specialite = specialite;
	}
 
	@Override
	public String toString() {
		return super.toString() + " ma spécialité est: " + this.specialite;
	}
 
}

