package monstres;

public class PetitChienVoleurDeGouter implements Monstre {
	private int vieActuelle;
	private int vieMax;
	private int degatsBase;
	private float precision;
	
	public PetitChienVoleurDeGouter( int vie ){
		vieActuelle = vie;
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
	public float getPrecision() {
		return precision;
	}
}
