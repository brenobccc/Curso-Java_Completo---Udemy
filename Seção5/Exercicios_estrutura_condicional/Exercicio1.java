import java.util.Scanner;

public class Exercicio1{
	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();

		if(x<0){
			System.out.println("NEGATIVO");
		}else{
			System.out.println("NAO NEGATIVO");
		}
		sc.close();
	}
}