public class Carr� extends Figure {
	private int longueur;

	public Carr�(int posx, int posy, int longueur) {
		super(posx, posy);
		this.longueur = longueur;
	}

	public int CalculPerim(){
		return 4 * longueur;
	}

	public int CalculAire(){
		return longueur * longueur;
	}
}