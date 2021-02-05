import java.util.Scanner;
public class Exercicio1{
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();


		System.out.println("SOMA = "+(a+b));	
		sc.close();	
	}
}