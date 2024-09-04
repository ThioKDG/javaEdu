package star;

public class Stars4 {
	public static void main(String[] args) {
		for(int i = 5; i > 0; i--) {
			for(int k = 5; k >i; k--) {
				System.out.printf(" ");									
			}
			for(int j = 0; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
