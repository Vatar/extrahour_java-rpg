package monstres;

public class PetitChienVoleurDeGouter extends Monstre {
	private int vieActuelle=5;
	private int vieMax = 5;
	private int degatsBase = 2;
	private double precision = 0.5;
	private int vieParNiveau = 5;
	private double degatsParNiveau = 0.5 ;
	
	public PetitChienVoleurDeGouter( ){
		super(Monstre.niveau);
		}

}
