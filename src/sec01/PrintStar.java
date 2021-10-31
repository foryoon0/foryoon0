package sec01;

public class PrintStar {

	public static void main(String[] args) {
		//1,2,3,4 순차적 별찍기
	      int i=0;
	      int j=0;
	      
	      for(i=1; i<=4; i++) {
	         for(j=1; j<=i; j++) {
	        	 System.out.print("*");
	        }
	         System.out.println();
	   }
	    	
	}

}
