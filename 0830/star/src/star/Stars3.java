package star;

public class Stars3 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int k = 5; k > i+1; k--) {
				System.out.printf(" ");									
			}
			for(int j = 0; j < i+1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
