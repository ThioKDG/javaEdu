package radius0920;

public class Ball extends Circle {
	
	Ball(double radi) {
		super(radi);
	}
	
	@Override
	public double getArea() {
		return 4 * PI * radi * radi;
	}
	
}
