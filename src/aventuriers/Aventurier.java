package aventuriers;

import monstres.Monstre;
import systeme.Personnage;

public abstract class Aventurier extends Personnage {

	private int niveau;
	private int vieMax;
	private int vieActuelle;
	private int degatsBase;
	private double precision;
	private int vieParNiveau;
	private int degatsParNiveau;
	
	public Aventurier(int niveau){
		this.vieMax = this.vieMax + vieParNiveau * Monstre.niveau;
		this.degatsBase = (int) (degatsBase + degatsParNiveau * Monstre.niveau);
		this.vieActuelle = this.vieMax;
	}
	
	
	public int getNiveau(){
		return niveau;
	}
	
	public void setLevel(int level){
		niveau=level;
	}
	
	public void levelUp(){
		niveau++;
	}
	
	
}
