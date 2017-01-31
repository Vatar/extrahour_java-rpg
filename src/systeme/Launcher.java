package systeme;

import monstres.*;

public class Launcher {

	public Launcher() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		PetitChienVoleurDeGouter bolero = new PetitChienVoleurDeGouter( 10 );
		System.out.print( bolero.getVie() );
		bolero.recoitDegats(10);
		System.out.print(bolero.estMort());

	}

}
