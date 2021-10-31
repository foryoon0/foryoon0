package sec01;

public class Mareumo {

	public static void main(String[] args) {
		// 피라미드 모양 별찍기
		int line = 4;
		int space = line/2+1;
		int star = 1;
		
		for(int i = 0; i<line; i++) {
			for(int j = 0; j<space; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<star; j++) {
				System.out.print("*");
			}
			for(int j=0; j<space; j++) {
				System.out.print(" ");
			}
			space-=1;
			star+=2;
			System.out.println();
			
		}
	}

}
