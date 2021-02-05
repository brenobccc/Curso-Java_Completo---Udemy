package application;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the measures of triangle X");

		double a,b,c;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		System.out.println("Enter the measures of triangle Y");
		
		double x,y,z;

		x = sc.nextDouble();
		y = sc.nextDouble();
		z = sc.nextDouble();

		double triangle_x_area,triangle_y_area;

		double p1 = (a+b+c)/ (double)2;
		double p2 = (x+y+z)/ (double)2;
		triangle_x_area = Math.sqrt(p1*(p1-a)*(p1-b)*(p1-c));
		triangle_y_area = Math.sqrt(p2*(p2-x)*(p2-y)*(p2-z));
		System.out.printf("Triangle x area: %.4f\n",triangle_x_area);
		System.out.printf("Triangle y area: %.4f\n",triangle_y_area);
		sc.close();

	}
}
