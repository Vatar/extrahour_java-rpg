package aventuriers;

import systeme.Personnage;

public class Guerrier extends Aventurier {
	private int vieMax=20; //C'est tanky un guerrier
	private int vieActuelle=20; 
	private int degats=5; //Et ça tape!
	private double precision = 0.5;
	private int vieParNiveau = 5;
	private double degatsParNiveau = 0.5;
	
	public Guerrier() {
		super(0);
	}
	
	public Guerrier(int niveau){
		super(niveau);
	}



}
