package ecole;

public class Personne {
	protected int id;
	protected String nom;
	protected String prenom;

	private static int count;
	 
	public Personne(String nom, String prenom) {
		this.id = ++count;
		this.nom = nom;
		this.prenom = prenom;
	}
 
	@Override
	public String toString() {
		return "Je suis " + this.nom.toUpperCase() + " "
				+ this.prenom.substring(0, 1).toUpperCase() + ""
				+ this.prenom.substring(1).toLowerCase();
	}
}


