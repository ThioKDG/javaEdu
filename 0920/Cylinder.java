package radius0920;

public class Cylinder extends Circle{
	double height;
	
	Cylinder(double radi, double height){
		super(radi);
		this.height = height;
	}
	double getHeight(){
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public double getArea(){
		return (2 * PI * radi * radi) + (2 * PI * height); 
	}
}
