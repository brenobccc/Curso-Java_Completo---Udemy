import java.util.Locale;
import java.util.Scanner;
public class Exercicio8{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double renda;
		renda = sc.nextDouble();

		if(renda>=0.00 && renda<=2000.00)
			System.out.println("Isento");
		else if(renda>=2000.01 && renda<=3000.00)
			// (8*renda)/100
			System.out.printf(" R$ %.2f ", ((renda-2000.00)*0.08));
		else if(renda>=3000.01 && renda<=4500.00)
			System.out.printf(" R$ %.2f ", ((renda-3000.00)*0.08)*0.18+1000.0*0.08);
		else if(renda>4500)
			System.out.printf(" R$ %.2f ", (((renda-4500.00)*0.08)+1500.0*0.18+1000.0*0.08));
				

		sc.close();
	}
}