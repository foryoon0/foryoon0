package sec01;

public class PrintStar1 {

	public static void main(String[] args) {
		// 4,3,2,1 역순차적 별찍기
		for (int i = 1; i < 5; i++) {
			for (int j = 4; j > 0; j--) {
			if (i < j) {
			System.out.print(" ");
			} else {
			System.out.print("*");
			}			
			}
			System.out.println();
			}
		
	}

}
