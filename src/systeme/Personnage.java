package systeme;

public interface Personnage {
	int vieActuelle = 0;
	int vieMax = 0;
	int degatsBase = 0;
	
	public default boolean estMort(){
		if( this.vieActuelle <= 0 ) return true;
		return false;
	}
	
	public default int getVie(){
		return this.vieActuelle;
	}
	
}
