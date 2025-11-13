
public class CalcPi {
	public static void main(String [] args) { 
		int num = Integer.parseInt(args[0]);
		double pi = Math.PI;
		System.out.println("pi according to Java: " + pi );
	    double sum = 0.0;
		for ( double i = 1; i <= num; i++ ) {

       		double output = 1 / ((i * 2) - 1);
			if (i%2 == 1) {
        		sum += output;
			} else {
				sum -= output;
			}  
		
 		};
		System.out.println("pi, approximated: " + sum * 4 );

	}
}
