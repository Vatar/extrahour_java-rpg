package monstres;

import systeme.Personnage;

public abstract class Monstre extends Personnage{
	private int vieMax;
	private int vieActuelle;
	private int degatsBase;
	private double precision;
	private int vieParNiveau;
	private int degatsParNiveau;
	
	public static int niveau = 1;
	
	public Monstre(int niveau){
		this.vieMax = this.vieMax + vieParNiveau * Monstre.niveau;
		this.degatsBase = (int) (degatsBase + degatsParNiveau * Monstre.niveau);
		this.vieActuelle = this.vieMax;
	}

	public static int getNiveau(){
		return niveau;
	}
	
	public static void setLevel(int level){
		niveau=level;
	}
	
	public static void levelUp(){
		niveau++;
	}
	
}
