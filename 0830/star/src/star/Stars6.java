package star;

public class Stars6 {

	public static void main(String[] args) {
		int num = 1;
		
		for(int i = 0; i < 5; i++) {
			for(int j = 4; j > i; j--) {
				System.out.print(" ");
			}	
			for(int k = 0; k < num; k++) {
				System.out.print("*");				
			}
			num = num + 2;
			System.out.println();
		}
	}

}
