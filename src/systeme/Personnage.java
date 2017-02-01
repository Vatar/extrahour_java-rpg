package systeme;

public abstract class Personnage {
	private int vieMax;
	private int vieActuelle;
	private int degatsBase;
	private double precision;
	
	public boolean estMort(){
		if( vieActuelle <= 0 ) return true;
		return false;		
	}
	
	public int getVie(){
		return vieActuelle;
	}
	
	public void recoitDegats( int degats ){
		this.vieActuelle -= degats;
	}
	
	public int getDegats(){
		return degatsBase;
	}
	
	public double getPrecision(){
		return precision;
	}
	
	

}
