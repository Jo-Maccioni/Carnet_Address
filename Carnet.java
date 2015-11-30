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
	
	//M�thode d'initialisation
	public void init()
	{
		//Cr�ation d'une liste de carnet vide
		carnet = new ArrayList<Contact>();
		
		//Initialisation du menu
		//Cr�ation de la liste d'�l�ments du menu
		ArrayList<String> elements = new ArrayList<String>();
		elements.add("1 : Afficher la liste de carnet");
		elements.add("2 : Ajouter un contact");
		elements.add("3 : Supprimer un contact");
		elements.add("4 : Quitter");
		
		menu = new Menu(elements);
	}
	
	//M�thode pour afficher les carnet
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
		
		//On lit le pr�nom du contact
		System.out.println("Entrez le pr�nom du contact");
		String prenom = lireClavier();
		
		//On lit l'adresse du contact
		System.out.println("Entrez l'adresse du contact");
		String adresse = lireClavier();
		
		// On cr�e le nouveau contact
		Contact c = new Contact(nom, prenom, adresse);
		
		// On l'ajoute au carnet
		carnet.add(c);
	}
	
	public void supprimerContact()
	{
		//On lit le nom du contact
		System.out.println("Entrez le nom du contact");
		String nom = lireClavier();
		
		//On lit le pr�nom du contact
		System.out.println("Entrez le pr�nom du contact");
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
	
	//M�thode pour lire une entr�e clavier
	public String lireClavier()
	{
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	//M�thode pour lancer l'op�ration demand�e
	public void op�ration(int choix)
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
			default : System.out.println("Veuillez choisisr un �l�ment dans le menu");
						pause();
			
		}
	}
	
	//M�thode pause
	
	public void pause()
	{
		System.out.println("Tapez Entr�e pour continuer");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
	}
	
	//M�thode pour lancer le programme carnet
	public void lancer()
	{
		int choix;
		do
		{
			choix = menu.afficherMenu();
			op�ration(choix);
			
		}while(choix != 4);
	}

}
