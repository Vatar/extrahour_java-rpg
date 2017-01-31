package systeme;

public interface Personnage {
	
	public boolean estMort();
	
	public int getVie();
	
	public void recoitDegats( int degats );
	
	public int getDegats();
	
	public float getPrecision();
	
}
