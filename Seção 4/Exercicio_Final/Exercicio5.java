import java.util.Locale;
import java.util.Scanner;

public class Exercicio5{
	public static void main(String[] args) {
		int cod_peca1, num_peca1;
		double valor_unit_peca1;

		int cod_peca2, num_peca2;
		double valor_unit_peca2;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		cod_peca1 = sc.nextInt();
		num_peca1 = sc.nextInt();
		valor_unit_peca1 = sc.nextDouble();


		cod_peca2 = sc.nextInt();
		num_peca2 = sc.nextInt();
		valor_unit_peca2 = sc.nextDouble();

		System.out.printf("VALOR A PAGAR: R$ %.2f",(double)(valor_unit_peca1*num_peca1)+(valor_unit_peca2*num_peca2));
		sc.close();
	}
}