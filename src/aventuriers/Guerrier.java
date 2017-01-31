package aventuriers;

public class Guerrier implements Aventurier {
	private int vieMax=20; //C'est tanky un guerrier
	private int vieActuelle=20; 
	private int degats=5; //Et ça tape!
	
	public Guerrier() {
	}

	@Override
	public boolean estMort() {
		if(vieActuelle < 1){
			return true;
		}
		return false;
	}

	@Override
	public int getVie() {
		return vieActuelle;
	}

}
