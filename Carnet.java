package javaproject;

import java.util.ArrayList;
import java.util.Scanner;


public class Carnet {
	
	//Liste de contacts
	private ArrayList<Contact> carnet;
	
	//Le menu
	private Menu menu;
	
	public Carnet()
	{
		init();
	}
	
	//Méthode d'initialisation
	public void init()
	{
		//Création d'une liste de carnet vide
		carnet = new ArrayList<Contact>();
		
		//Initialisation du menu
		//Création de la liste d'éléments du menu
		ArrayList<String> elements = new ArrayList<String>();
		elements.add("1 : Afficher la liste de carnet");
		elements.add("2 : Ajouter un contact");
		elements.add("3 : Supprimer un contact");
		elements.add("4 : Quitter");
		
		menu = new Menu(elements);
	}
	
	//Méthode pour afficher les carnet
	public void afficherContacts()
	{
		for(Contact c : carnet)
		{
			System.out.println(c);
		}
	}
	
	public void ajouterContact()
	{
		//On lit le nom du contact
		System.out.println("Entrez le nom du contact");
		String nom = lireClavier();
		
		//On lit le prénom du contact
		System.out.println("Entrez le prénom du contact");
		String prenom = lireClavier();
		
		//On lit l'adresse du contact
		System.out.println("Entrez l'adresse du contact");
		String adresse = lireClavier();
		
		// On crée le nouveau contact
		Contact c = new Contact(nom, prenom, adresse);
		
		// On l'ajoute au carnet
		carnet.add(c);
	}
	
	public void supprimerContact()
	{
		//On lit le nom du contact
		System.out.println("Entrez le nom du contact");
		String nom = lireClavier();
		
		//On lit le prénom du contact
		System.out.println("Entrez le prénom du contact");
		String prenom = lireClavier();
		
		//On lit l'adresse du contact
		System.out.println("Entrez l'adresse du contact");
		String adresse = lireClavier();
		
		
		//On supprime le contact
		for(Contact c : carnet)
		{	
			if((c.getNom().equals(nom))&&
				(c.getPrenom().equals(prenom))&&
				(c.getAdresse().equals(adresse)))
			{
				carnet.remove(c);
				break;
			}
		}
	}
	
	//Méthode pour lire une entrée clavier
	public String lireClavier()
	{
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	//Méthode pour lancer l'opération demandée
	public void opération(int choix)
	{
		switch(choix)
		{
			//Si l'utilisateur choisis d'afficher les contact
			case 1 : afficherContacts();
					pause();
					break;
			case 2 : ajouterContact();
					pause();
					break;
			case 3 : supprimerContact();
					pause();
			case 4 : System.out.println("Au revoir !");
					break;
			default : System.out.println("Veuillez choisisr un élément dans le menu");
						pause();
			
		}
	}
	
	//Méthode pause
	
	public void pause()
	{
		System.out.println("Tapez Entrée pour continuer");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
	}
	
	//Méthode pour lancer le programme carnet
	public void lancer()
	{
		int choix;
		do
		{
			choix = menu.afficherMenu();
			opération(choix);
			
		}while(choix != 4);
	}

}
