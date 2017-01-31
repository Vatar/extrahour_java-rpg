package monstres;

import systeme.Personnage;

public abstract class Monstre implements Personnage{
	
	public int niveau = 1;
	
	public int getNiveau(){
		return niveau;
	}
	
	public void levelUp(){
		niveau++;
	}

}
