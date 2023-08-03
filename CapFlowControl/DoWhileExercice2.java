public class DoWhileExercice2 {
	public static void main(String args[]) {
		int m = 0, n =0;
		while(m < 5) {
			n++;
			System.out.println("m = " + m);
			if( m == 3) 
				continue;
			
			
			switch (m) {
				case 0:
				case 1: 
				n++;
				default:
				n++;	
			}
			m++;
		}
		System.out.println(m + " " + n); 
	}
}

//Print 5 and 12 ERROR it is infinite