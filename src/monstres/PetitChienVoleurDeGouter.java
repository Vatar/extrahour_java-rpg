package monstres;

public class PetitChienVoleurDeGouter implements Monstre {
	private int vieActuelle;
	private int vieMax = 10;
	private int degatsBase = 2;
	private double precision = 0.5;
	
	public PetitChienVoleurDeGouter( ){
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
