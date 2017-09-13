public class Cercle extends Figure {
	private int rayon;

	public Cercle(int posx, int posy, int rayon) {
		super(posx, posy);
		this.rayon = rayon;
	}

	public double CalculPerim(){
		return Math.PI * 2 * rayon;
	}

	public double CalculAire(){
		return Math.PI * rayon * rayon;
	}
}