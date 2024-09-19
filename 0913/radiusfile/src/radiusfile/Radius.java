package radiusfile;
import java.util.Scanner;


class Circle{
	final double Pi = 3.14;
	int radi;
	
	void CircleArea() {
		System.out.println("반지름이 " + radi + "인 원의 넓이는 " + (Pi * radi * radi) + "입니다.");
	}
	
	Circle(int radi){
		this.radi = radi;
	}
}

public class Radius {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원의 반지름 : ");
		int radi = scanner.nextInt();
		
		Circle cir1 = new Circle(radi);
		
		cir1.CircleArea();
		
	}

}
