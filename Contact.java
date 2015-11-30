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

	//Pour r�cup�rer le nom
	public String getNom() {
		return nom;
	}

	//pour modifier le nom
	public void setNom(String nom) {
		this.nom = nom;
	}

	//Pour r�cup�rer le pr�nom
	public String getPrenom() {
		return prenom;
	}

	//Pour modifier le pr�nom
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	//Pour r�cup�rer l'adresse
	public String getAdresse() {
		return adresse;
	}

	//Pour odifier l'adresse
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	//Affiche la chaine de caract�re qui d�crit l'objet
	public String toString()
	{
		return "Nom : " + nom + "\n" +
				"Pr�nom : " + prenom + "\n" +
				"Adresse : " + adresse + "\n";
	}
}
