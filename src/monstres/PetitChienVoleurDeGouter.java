package monstres;

public class PetitChienVoleurDeGouter implements Monstre {
	private int vieActuelle;
	private int vieMax;
	
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
}
