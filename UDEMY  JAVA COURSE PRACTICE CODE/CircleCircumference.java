import java.util.Scanner;
 public class CircleCircumference {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter circle radius: ");
		
		double R = sc.nextDouble();
		
	double circleCircumference = Math.PI*2*R;

		System.out.println("Circle circumference is: " + circleCircumference);
	}
    
}
