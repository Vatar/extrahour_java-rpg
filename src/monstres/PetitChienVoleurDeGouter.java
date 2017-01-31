package monstres;

public class PetitChienVoleurDeGouter extends Monstre {
	private int vieActuelle;
	private int vieMax = 5;
	private int degatsBase = 2;
	private double precision = 0.5;
	private int vieParNiveau = 5;
	private double degatsParNiveau = 0.5 ;
	
	public PetitChienVoleurDeGouter( ){
		this.vieMax = this.vieMax + vieParNiveau * this.niveau;
		this.degatsBase = (int) (degatsBase + degatsParNiveau * this.niveau);
		this.vieActuelle = this.vieMax;
		}

	@Override
	public void recoitDegats(int degats) {
		this.vieActuelle -= degats;
		
	}

	@Override
	public boolean estMort() {
		if( vieActuelle <= 0 ) return true;
		return false;
	}

	@Override
	public int getVie() {
		return vieActuelle;
	}

	@Override
	public int getDegats() {
		return degatsBase;
	}

	@Override
	public double getPrecision() {
		return precision;
	}
}
