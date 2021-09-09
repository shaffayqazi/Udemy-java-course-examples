import java.util.Scanner;

public class AreaofTriangle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter A side of a triangle: ");
		double A = sc.nextInt();
		
		System.out.print("Please, enter B side of a triangle: ");
		double B = sc.nextInt();
		
		System.out.print("Please, enter C side of a triangle: ");
		double C = sc.nextInt();
		
	    double P = (A + B + C)/2;
	    
	    double triangleArea = Math.sqrt(P* (P-A) * (P-B) * (P-C));
		
		System.out.println("Triangle area is: " + triangleArea);
		
	}

}
