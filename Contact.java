package javaproject;

public class Contact {

	// Informations du contact
	private String nom;
	private String prenom;
	private String adresse;
	
	public Contact(String nom, String prenom, String adresse)
	{
		//Initialisation des attributs
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setAdresse(adresse);
	}

	//Pour récupérer le nom
	public String getNom() {
		return nom;
	}

	//pour modifier le nom
	public void setNom(String nom) {
		this.nom = nom;
	}

	//Pour récupérer le prénom
	public String getPrenom() {
		return prenom;
	}

	//Pour modifier le prénom
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	//Pour récupérer l'adresse
	public String getAdresse() {
		return adresse;
	}

	//Pour odifier l'adresse
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	//Affiche la chaine de caractère qui décrit l'objet
	public String toString()
	{
		return "Nom : " + nom + "\n" +
				"Prénom : " + prenom + "\n" +
				"Adresse : " + adresse + "\n";
	}
}
