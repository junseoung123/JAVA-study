package ch01;

public class ForEx01 {

	public static void main(String[] args) {
		// for 문 형식
		/*for( 초기값 ; 조건식 ; 증감식) {
			반복할내용
		}*/
	
	    for (int i=0; i<10; i++ ) {
	    	System.out.print(i + " ");
	    }
	    System.out.println();
	    for(int i=10; i>0; i-- ) {
	    	System.out.print(i + " ");
	    }
	    System.out.println();
	    for(int i=2; i<=10; i+=2) {
	    	System.out.print(i + " ");
	    }
	    System.out.println();
	    for(int i=1; i<=15; i=+2) {
	    	System.out.print(i + " ");
	    }
	    System.out.println();
	    for(int i=1, j=2; i<=10 && j<=8; i++, j++) {
	    	System.out.print(i + " " + j + " , ");
	    }
	    System.out.println();
	    int i=1, j=2;
	    for( ; ;  ) {
	    	if(i<=10 && j<=8) {
	    		System.out.print(i + " " + j + " , ");
	    		i++;
	    		j++;
	    	} else {
	    		break;
	    	}
	    }
	    }
	    
}
	
