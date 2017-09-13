public class Rectangle extends Figure {
	private int longueur, largeur;
	
	public Rectangle(int posx, int posy, int longueur, int largeur) {
		
		super(posx, posy); 
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	public int CalculPerim(){
		return 2 * (longueur + largeur);
	}
	
	public int CalculAire(){
		return longueur * largeur;
	}
}