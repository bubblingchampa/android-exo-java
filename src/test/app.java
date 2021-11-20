package test;

import ecole.Employe;
import ecole.Etudiant;
import ecole.Professeur;
 
public class app {
	public static void main(String[] main) {
		Employe[] employes = new Employe[2];
		employes[0] = new Employe("Douk", "Patrick", 10000);
		employes[1] = new Employe("Ngoye", "Fernand", 10000);
		System.out.println("La liste des employes : ");
		for (Employe e : employes)
			System.out.println("\t" + e);
 
		Etudiant[] etudiants = new Etudiant[2];
		etudiants[0] = new Etudiant("Obaka", "Ben", "65678754");
		etudiants[1] = new Etudiant("Alseny", "Thomas", "87543543");
		System.out.println("La liste des étudiants : ");
		for (Etudiant e : etudiants)
			System.out.println("\t" + e);
 
		Professeur[] professeurs = new Professeur[2];
		professeurs[0] = new Professeur("Oba", "Chris", 5700, "JAVA/JEE");
		professeurs[1] = new Professeur("Magassouba", "Cheick", 5000,
				"Mathématique");
		System.out.println("La liste des professeurs : ");
		for (Professeur p : professeurs)
			System.out.println("\t" + p);
	}
}




