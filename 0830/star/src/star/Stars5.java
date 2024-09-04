package star;

public class Stars5 {

	public static void main(String[] args) {
		int num = 9;
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = num; k > 0; k--) {
				System.out.print("*");				
			}
			num = num - 2;
			System.out.println();
		}
	}

}
