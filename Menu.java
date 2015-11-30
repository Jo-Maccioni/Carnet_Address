package javaproject;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	
	//Liste des éléments de notre menu
	private ArrayList<String> menu = new ArrayList<String>();
	
	public Menu(ArrayList<String> menu)
	{
		//Initialisation du menu
		this.menu = menu;
	}
	
	//Affichage du menu
	public int afficherMenu()
	{
		System.out.println("Faites votre choix");
		
		//Pour chaque element du menu
		for(String element : menu)
		{
			System.out.println(element);
		}
		
		//Lire le clavier et retourner la valeur lue
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();

	}
	
}
