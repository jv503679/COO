public class Figure {
	protected int posx, posy, angle;
	
	public Figure(int posx, int posy){
		this.posx = posx;
		this.posy = posy;
		angle = 0;
	}
	
	public void rotate(int a){
		angle +=a ;
		System.out.println("Rotation de " + a + " effectuée : angle de " + angle);
	}
}