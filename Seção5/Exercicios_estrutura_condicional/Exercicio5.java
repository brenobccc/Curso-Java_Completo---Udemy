import java.util.Locale;
import java.util.Scanner;

public class Exercicio5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int codigo,qtde=0;
		double preco=0;
		Locale.setDefault(Locale.US);
		codigo = sc.nextInt();
		qtde = sc.nextInt();
		switch(codigo){
			case 1: preco=4.00*qtde; break;
			case 2: preco= (double) 4.50*qtde; break;
			case 3: preco=5.00*(double)qtde; break;
			case 4: preco=2.00*(double)qtde; break;
			case 5: preco=1.50*(double)qtde; break;
		}

		System.out.printf("Total: R$ %.2f",(preco));
		sc.close();
	}

}