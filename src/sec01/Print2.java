package sec01;

public class Print2 {

	public static void main(String[] args) {
		// 4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로 출력하시오.
		
		for(int a=1; a<=10; a++)
			for(int b=1; b<=10; b++)
				if((4*a+5*b)==60) {
					System.out.println( a + "," + b );
				}
		 
		
	}

}
