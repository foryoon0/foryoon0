package sec01;
import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		// 사용자가 입력한 수로부터 9단까지 출력하는 프로그램을 작성하시오.
		Scanner gugudan = new Scanner(System.in);
		System.out.print("원하시는 숫자를 입력하세요: ");
			int a = gugudan.nextInt();
			if ((a==0)||(a>9))
			{
			System.out.println("다시 입력하세요.");
			}
		
			else if (!(a==0)||a<=9) 
				for(int b=1; b<=9; b++)
				 {
					System.out.println( a + " X " + b + " = " + (a*b));
				 }
				
				}
				
				}


