package radius0920;

public class Circle {
	static final double PI = 3.14;
	double radi;
	
	Circle(double radi){
		this.radi = radi;
	}
	
	double getArea() {
		return PI * this.radi * this.radi;
	}
	
	double getRadius() {
		return radi;
	}
	
	void setRadius(double radi) {
		this.radi = radi;
	}
	

}
