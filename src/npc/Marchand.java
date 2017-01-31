package npc;

import java.util.ArrayList;

import objets.Objet;

public abstract class Marchand {

	/**
	 * Nombre d'or possédé par le marchand (si on permet la vente d'objets personnage au marchand)
	 */
	private int or; 
	
	/**
	 * Liste des objets que le marchand possède actuellement
	 */
	private ArrayList<Objet> marchandises;
	
	
	
}
