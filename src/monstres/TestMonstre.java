package monstres;

public class TestMonstre {

	public static void main(String[] args) {
		PetitChienVoleurDeGouter bolero = new PetitChienVoleurDeGouter( );
		System.out.println( bolero.getVie() );
		bolero.recoitDegats(30);
		System.out.println(bolero.estMort());
		PetitChienVoleurDeGouter bolero2 = new PetitChienVoleurDeGouter( );
		System.out.println( bolero2.getVie() );
		bolero2.recoitDegats(30);
		System.out.println(bolero2.estMort());
		PetitChienVoleurDeGouter bolero3 = new PetitChienVoleurDeGouter( );
		System.out.println( bolero3.getVie() );
		bolero3.recoitDegats(30);
		System.out.println(bolero3.estMort());

	}
	
}
