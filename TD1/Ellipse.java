public class Ellipse extends Figure {
	private int rayon1, rayon2;

	public Ellipse(int posx, int posy, int rayon1, int rayon2) {
		super(posx, posy);
		this.rayon1 = rayon1;
		this.rayon2 = rayon1;
	}

	public double CalculPerim(){
		return Math.PI * 2 * ( Math.sqrt((rayon1*rayon1 + rayon2*rayon2) / 2));
	}

	public double CalculAire(){
		return Math.PI * rayon1 * rayon2;
	}
}